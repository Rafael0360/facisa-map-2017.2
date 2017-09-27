
public class ImagemAdapter implements ImagemTarget {
	private Imagem img;
	
	public ImagemAdapter(Imagem img) {
		this.img = img;
	}
	
	@Override
	public void desenharImagem() {
		System.out.println("DESENHAR ADAPTER");
		this.img.desenhar();
		
	}

	@Override
	public void carregarImagem() {
		System.out.println("CARREGAR ADAPTER");
		this.img.carregar();
		
	}

}
