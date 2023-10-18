public class Coelho {
        private String nome;
        private char representação = 'C';

        public Coelho(String nome,char representação) {
            this.nome = nome;
            this.representação = 'C';
        }

        public void Comer() {
            System.out.println(nome + " Vai comer as plantas ");
        }
    }

