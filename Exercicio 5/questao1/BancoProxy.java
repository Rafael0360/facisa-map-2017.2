package questao1;
public class BancoProxy implements BancoUsuarios {
		
		private int quantidadeDeUsuarios;
		private int usuariosConectados;
		protected String usuario, senha;

		public BancoProxy(String usuario, String senha) {
			this.usuario = usuario;
			this.senha = senha;
			this.quantidadeDeUsuarios = (int) (Math.random() * 100);
			this.usuariosConectados = (int) (Math.random() * 10);
		}

		public String getNumeroDeUsuarios() {
			if (temPermissaoDeAcesso()) {
				return new String("Total de usuários: " + quantidadeDeUsuarios);
			}
			return null;
		}

		
		public String getUsuariosConectados() {
			if (temPermissaoDeAcesso()) {
				return new String("Usuários conectados: " + usuariosConectados);
			}
			return null;
		}

		private boolean temPermissaoDeAcesso() {
			return usuario == "admin" && senha == "admin";
		}
}

