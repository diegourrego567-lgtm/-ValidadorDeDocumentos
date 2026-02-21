package src4;

public class NormalizadorID {

    
    public static void main(String[] args) {
        NormalizadorID normalizador = new NormalizadorID();
        normalizador.procesarID();
    }


    public void procesarID() {

     
        String idSucio = " Usuario_123  ";
         String idLimpio = idSucio.trim().toUpperCase().substring(0, 8);

        System.out.println("id original: " + idSucio);
        System.out.println("id limpio: " + idLimpio);

        System.out.println("\noriginal: " + System.identityHashCode(idSucio));
        System.out.println(" limpio: " + System.identityHashCode(idLimpio));

            StringBuilder builder = new StringBuilder(idLimpio);

            builder.reverse();

        String idInvertido = builder.toString();

        System.out.println("\nID invertido: " + idInvertido);
      
    
  }
}
