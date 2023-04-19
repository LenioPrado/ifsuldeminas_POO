package ListaUnicamp;

public class Questao2 {

    private int dia;
    private int mes;
    private int ano;
    private String data;

    public Questao2(String data) {
        this.data = data;
        if(!dataValida(data)){
            setDataPadrao();
        }
    }

    public static void executar(){
        String data = "31/01/2023";
        Questao2 q2 = new Questao2(data);
        System.out.println("Data: " + data);
        System.out.println("Dia: " + q2.getDia());
        System.out.println("Mês: " + q2.getMes());
        System.out.println("Ano: " + q2.getAno());
    }

    private void setDataPadrao(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1;
    }

    private boolean dataValida(String data){
        if (data == null || data.isEmpty()) {
            return false;
        }
        
        if(!validaCaracteres(data)){ return false; }           

        String[] dataParse = data.split("/"); 

        if(dataParse.length != 3){
            return false;
        } else {            
           
            try {
                setParseData(dataParse);

                if(!validaIntervalosValidos()) { return false; }

                return validaMesesDias();                

            } catch (Exception e) {
                return false;
            }
        }
    }

    private boolean validaCaracteres(String data){
        for (int index = 0; index < data.length(); index++) {
            int charInt = data.charAt(index);
            // Valida se a Str tem apenas os caracteres: 0 a 9 e / 
            if (charInt < 47 || charInt > 57 ) {
                return false;
            }
        }
        return true;
    }

    private void setParseData(String[] dataParse){
        this.dia = Integer.parseInt(dataParse[0]);
        this.mes = Integer.parseInt(dataParse[1]);
        this.ano = Integer.parseInt(dataParse[2]);
    }

    private boolean validaIntervalosValidos(){
        if (ano < 1 || ano > 9999) { return false; }

        if (mes < 1 || mes > 12) { return false; }

        if (dia < 1 || dia > 31) { return false; }

        return true;
    }

    private boolean validaMesesDias(){
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            return dia >= 1 && dia <= 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return dia >= 1 && dia <= 30;
        } else {
            if(isBissexto()){ return dia <= 29; } 
            else { return dia <= 28; }
        }
    }

    public boolean isBissexto(){
        // https://learn.microsoft.com/pt-br/office/troubleshoot/excel/determine-a-leap-year
        boolean result = !temResto(4) && !temResto(100) && !temResto(400);
        return result;
    }

    private boolean temResto(int divisor){
        double divisao = (double) ano / divisor;
        int inteiro = (int) divisao;
        double resto = divisao - inteiro;
        if(resto > 0 ) return true;
        return false;
    }

    public String getDiaExtenso() {
        switch(dia){
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "";
        }
    }

    public int compara(Questao2 q2){
        if(q2.getAno() > getAno()) { 
            return -1; 
        } else if (q2.getAno() == getAno()) {
            if(q2.getMes() > getMes()) {             
                return -1; 
            } else if(q2.getMes() == getMes()){
                if(q2.getDia() > getDia()) {             
                    return -1; 
                } else if (q2.getDia() == getDia()){
                    return 0;
                } else {
                    return 1; 
                }
            } else {                
                return 1;
            }
        } else {
            return 1;
        }
    }

    public Questao2 clonar(){
        return new Questao2(this.data);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}