public class MinhaClass {

    public static void main(String[] args) {
        String primeiroNome = "Janderson";
        String segundoNome = "Freitas";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        int soma = somar (10,45);

        // comentario
        System.out.println(nomeCompleto);
        System.out.println(soma);
    
    }
    public static String nomeCompleto (String name, String lastName) {
        return name.concat(" ").concat(lastName);
        
    }
    public static int somar (int num1, int num2){
        return num1 + num2;
    }


}
