package com.example.spring;

public class Store {

    /**
     * 店铺到某个经纬度(点)的距离--距离某个固定的点越近,排序优先级越高
     */
    private double distance;
    /**
     * 店铺等级--等级越高,排序优先级越高
     */
    private int sgrade;

    public Store(double distance, int sgrade) {
        super();
        this.distance = distance;
        this.sgrade = sgrade;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getSgrade() {
        return sgrade;
    }

    public void setSgrade(int sgrade) {
        this.sgrade = sgrade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Store{");
        sb.append("distance=").append(distance);
        sb.append(", sgrade=").append(sgrade);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(distance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + sgrade;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Store other = (Store) obj;
        if (Double.doubleToLongBits(distance) != Double
                .doubleToLongBits(other.distance))
            return false;
        if (sgrade != other.sgrade)
            return false;
        return true;
    }
}
