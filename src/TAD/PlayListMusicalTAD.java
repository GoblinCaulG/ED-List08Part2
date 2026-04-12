package TAD;

public interface PlayListMusicalTAD {
    void addLast(int idMusica);
    void addFirst(int idMusica);
    void insertAT(int posicao, int idMusica);
    void addSorted(int idMusica);
    void removeLast();
    void removeFirst();
    void removeAt(int posicao);
    void remove(int idMusica);
    int find(int idMusica);
    int get(int posicao);
    void set(int posicao, int idMusica);
    boolean isEmpty();
    boolean isFull();
    int count();
    void display();
}