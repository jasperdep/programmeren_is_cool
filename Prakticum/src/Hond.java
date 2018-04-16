public class Hond {

    private boolean head = true;
    private boolean tail = true;

    public boolean hasHead() {

        return this.head;

    }

    public boolean hasTail() {

        return this.tail;

    }

    public boolean equals(Kat kat) {

        return  (kat.hasHead() == this.hasHead() && kat.hasTail() == this.hasTail());

    }
}
