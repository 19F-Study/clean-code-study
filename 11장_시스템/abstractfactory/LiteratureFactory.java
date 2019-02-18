package abstractfactory;

public class LiteratureFactory implements BookAbstractFactory {

    @Override
    public Book getBook() {
        System.out.println("This is Literature");
        return new Literature();
    }

}
