public class Libro {
	private String titulo;
	private String autor;
	private String editorial;
	//Constructor by default
	public Libro(){
		titulo="Harry Potter";
		autor="J.K.Rowling";
		editorial="Salamandra";
	}
	//Constructor with parameters
	public Libro(String a ,String b, String c){
		this.titulo=a;
		this.autor=b;
		this.editorial=c;
	}
	public void setTitulo(String t){
	    this.titulo=t;
	}
	public void setAutor(String a){
	    this.autor=a;
	}
	public void setEditorial(String e){
		this.editorial=e;
	}
	public String getTitulo(){
	    return titulo;
	}
	public String getAutor(){
	    return autor;
	}
	public String getEditorial(){
	    return editorial;
	}
	public String toString(){
		return this.autor + "escribió el libro " + this.titulo + "y lo publicó la editorial" + this.editorial;
	}
	public static void main(String[] args){
		Libro hp = new Libro();
	    Libro cuatro = new Libro("Four","Veronica Roth","Life");
	    System.out.println("El libro se llama: "+hp.getTitulo());
	    System.out.println("El autor del libro es "+hp.getAutor());
	    System.out.println("La editorial del libro es: "+hp.getEditorial());
	    System.out.println("El libro se llama: "+cuatro.getTitulo());
	    System.out.println("El autor del libro es "+cuatro.getAutor());
	    System.out.println("La editorial del libro es: "+cuatro.getEditorial());
	}
}
