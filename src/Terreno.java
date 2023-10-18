public class Terreno {
        private String tipo;

        public Terreno(String tipo) {
            this.tipo = tipo;
        }

        public void Descrição() {
            System.out.println("Este terreno é do tipo " + tipo + "plano");
        }
    }
