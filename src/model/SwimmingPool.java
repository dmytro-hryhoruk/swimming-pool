package model;

public final class SwimmingPool {
    private final String name;
    private final int depth;
    private final int width;
    private final int length;
    private final String address;

    public SwimmingPool(String name,
                        int depth,
                        int width,
                        int length,
                        String address) {
        this.name = name;
        this.depth = depth;
        this.width = width;
        this.length = length;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getDepth() {
        return depth;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "\tSwimmingPool{" +
                "length=" + length +
                ", width=" + width +
                ", depth=" + depth +
                ", adress=" + address +
                '}';
    }
}
