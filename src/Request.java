public class Request {
    private int position;
    private boolean serviced = false;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isServiced() {
        return serviced;
    }

    public void setServiced(boolean serviced) {
        this.serviced = serviced;
    }

    public Request(int position) {
        this.position = position;
        this.serviced = false;
    }

    public static void main(String[] args) {

    }
}
