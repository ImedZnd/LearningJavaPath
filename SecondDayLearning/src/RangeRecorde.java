public record RangeRecorde(int start, int end){
    public RangeRecorde{ // compact constructor "we don't have the (int start, int end)"
        if (start<=end){
            throw new IllegalArgumentException("the start record must be lesser than the end ");
        }
    }
}
