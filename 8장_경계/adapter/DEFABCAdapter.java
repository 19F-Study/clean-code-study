package adapter;

// Target: ABCDataStorage, Adaptee: DEFDataStorage
public class DEFABCAdapter implements ABCDataStorage {

    private DEFDataStorage storage;

    @Override
    public ABCConnection getConnection() {
        return convertProtocol(this.storage.getConnection());
    }

    private ABCConnection convertProtocol(DEFConnection conn) {
        // Do some work for protocol converting...
        return null;
    }

    public void setStorage(DEFDataStorage storage) {
        this.storage = storage;
    }

}
