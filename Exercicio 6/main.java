
public class main {

	public static void main(String[] args) {
		Imagem img = new ImagemJpeg();
		ImagemAdapter ia = new ImagemAdapter(img);
		img.carregar();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		ia.carregarImagem();

	}

}
