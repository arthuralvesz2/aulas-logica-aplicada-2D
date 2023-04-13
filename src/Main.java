public class Main {
    public static void main(String[] args) {
        // Laço enquanto - while
        int contador = 0;
        while(contador < 10){
            // Processos
            System.out.println("Contador = " + contador);
            contador = contador + 1; // Incremento
        }

        // Laço faça enquanto - do while
        int cont = 1;
        do{
            System.out.println(cont);
            cont++; // Incremento
        }while(cont <= 10);

        // Laço para faça por
        for(int x=0; x<10; x++){
            System.out.println(x);
        }
    }
}