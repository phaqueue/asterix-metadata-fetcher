package edu.uci.ics.asterix.result;

public class Tuple {
    public Tuple(String x, String y) {
        this.DataverseName = x;
        this.DatatypeName = y;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < this.DataverseName.length(); i++)
            hash = (hash * 97 + this.DataverseName.charAt(i) - 'A') % 19260817;
        for (int i = 0; i < this.DatatypeName.length(); i++)
            hash = (hash * 97 + this.DatatypeName.charAt(i) - 'A') % 19260817;
        return hash;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        Tuple that = (Tuple) other;
        return (this.DataverseName.equals(that.DataverseName)) && (this.DatatypeName.equals(that.DatatypeName));
    }

    public String getDataverseName() {
        return DataverseName;
    }

    public String getDatatypeName() {
        return DatatypeName;
    }

    private final String DataverseName;
    private final String DatatypeName;
}
