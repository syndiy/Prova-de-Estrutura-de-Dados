public class Blocop {
        private String nome;
        private String datanascimento;
        private Blocop anterior; 
    
        public Blocop(String nome, String datanascimento) {
            this.nome = nome;
            this.datanascimento = datanascimento;
            this.anterior = null; 
        }
    
        public String getNome() {
            return nome;
        }
    
        public Blocop getAnterior() {
            return anterior;
        }

        public String getDatanascimento() {
            return datanascimento;
        }

        public void setAnterior(Blocop anterior) {
            this.anterior = anterior;
        }

        public void setDatanascimento(String datanascimento) {
            this.datanascimento = datanascimento;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getdatanascimento() {
            return datanascimento;
        }
    
        public Blocop getanterior() {
            return anterior;
        }
    
        public void setanterior(Blocop anterior) {
            this.anterior=anterior;
        }
    }
