package abstractfactory;

public class NonLiteratureFactory implements BookAbstractFactory {

    @Override
    public Book getBook() {
        System.out.println("This is NonLiterature");
        return new NonLiterature();
    }

}
