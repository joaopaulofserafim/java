public class dado{
    public static void main(String[] args) {
        int[] contagem = new int[6]; // array pra contar as faces
        int total = 1000000; // total de lançamentos

        for (int i = 0; i < total; i++) {
            int face = (int)(Math.random() * 6) + 1; // número de 1 a 6
            contagem[face - 1]++; // aumenta a contagem da face
        }

        // Mostrar resultado
        for (int i = 0; i < 6; i++) {
            double porcentagem = (contagem[i] * 100.0) / total;
            System.out.println("Face " + (i + 1) + ": " + porcentagem + "%");
        }
    }
}
