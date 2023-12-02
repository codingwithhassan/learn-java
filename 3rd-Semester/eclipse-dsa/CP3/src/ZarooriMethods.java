public interface ZarooriMethods<T> {
    public interface ZarooriMethod {
        public abstract <T> void add(T value);
        
        public abstract <T> void add(T value, int position);
        
        public abstract <T> T remove(int position);
        
        public abstract <T> int replace(T value, int position);
        
        public abstract void clear();
        
        public abstract boolean isEmpty();
        
        public abstract <T> int search(T value);
        
        public abstract <T> int getLength();
    }
}
