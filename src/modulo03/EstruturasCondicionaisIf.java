package modulo03;

public class EstruturasCondicionaisIf {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebidas = idade >= 18;
        if (isAutorizadoComprarBebidas) {
            System.out.println("Autorizado a comprar bebidas");
        }

        if(isAutorizadoComprarBebidas == false){
            System.out.println("Não autorizado a comprar bebidas");
        }

        System.out.println("Fora do IF ");
    }
}
