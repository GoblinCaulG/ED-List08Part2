package TAD;

public class PlayListMusical implements PlayListMusicalTAD {

    private int[] idsMusicas;
    private int quantidadeMusicas;

    public PlayListMusical(int tamanho) {
        this.idsMusicas = new int[tamanho];
        this.quantidadeMusicas = 0;
    }

    @Override
    public void addLast(int idMusica) {
        if (quantidadeMusicas < idsMusicas.length) {
            idsMusicas[quantidadeMusicas] = idMusica;
            quantidadeMusicas++;
        } else {
            System.out.println("Erro: Playlist cheia!");
        }
    }

    @Override
    public void addFirst(int idMusica) {
        if (quantidadeMusicas < idsMusicas.length) {
            for (int i = quantidadeMusicas; i > 0; i--) {
                idsMusicas[i] = idsMusicas[i - 1];
            }
            idsMusicas[0] = idMusica;
            quantidadeMusicas++;
        } else {
            System.out.println("Erro: Playlist cheia!");
        }
    }

    @Override
    public void insertAT(int posicao, int idMusica) {
        if (quantidadeMusicas >= idsMusicas.length) {
            System.out.println("Erro: Playlist cheia!");
            return;
        }
        if (posicao < 0 || posicao > quantidadeMusicas) {
            System.out.println("Posição inválida!");
            return;
        }
        for (int j = quantidadeMusicas; j > posicao; j--) {
            idsMusicas[j] = idsMusicas[j - 1];
        }
        idsMusicas[posicao] = idMusica;
        quantidadeMusicas++;
    }

    @Override
    public void addSorted(int idMusica) {
        if (quantidadeMusicas == idsMusicas.length) {
            System.out.println("Erro: Playlist cheia!");
            return;
        }
        int i = 0;
        while (i < quantidadeMusicas && idsMusicas[i] < idMusica) {
            i++;
        }
        for (int j = quantidadeMusicas; j > i; j--) {
            idsMusicas[j] = idsMusicas[j - 1];
        }
        idsMusicas[i] = idMusica;
        quantidadeMusicas++;
    }

    @Override
    public void removeLast() {
        if (quantidadeMusicas > 0) {
            quantidadeMusicas--;
        } else {
            System.out.println("Playlist vazia!");
        }
    }

    @Override
    public void removeFirst() {
        if (quantidadeMusicas == 0) {
            System.out.println("Playlist vazia!");
            return;
        }
        for (int i = 0; i < quantidadeMusicas - 1; i++) {
            idsMusicas[i] = idsMusicas[i + 1];
        }
        quantidadeMusicas--;
    }

    @Override
    public void removeAt(int posicao) {
        if (posicao < 0 || posicao >= quantidadeMusicas) {
            System.out.println("Posição inválida!");
            return;
        }
        for (int i = posicao; i < quantidadeMusicas - 1; i++) {
            idsMusicas[i] = idsMusicas[i + 1];
        }
        quantidadeMusicas--;
    }

    @Override
    public void remove(int idMusica) {
        for (int i = 0; i < quantidadeMusicas; i++) {
            if (idsMusicas[i] == idMusica) {
                for (int j = i; j < quantidadeMusicas - 1; j++) {
                    idsMusicas[j] = idsMusicas[j + 1];
                }
                quantidadeMusicas--;
                return;
            }
        }
    }

    @Override
    public int find(int idMusica) {
        for (int i = 0; i < quantidadeMusicas; i++) {
            if (idsMusicas[i] == idMusica) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int get(int posicao) {
        if (posicao < 0 || posicao >= quantidadeMusicas) {
            System.out.println("Posição inválida!");
            return -1;
        }
        return idsMusicas[posicao];
    }

    @Override
    public void set(int posicao, int idMusica) {
        if (posicao < 0 || posicao >= quantidadeMusicas) {
            System.out.println("Posição inválida!");
            return;
        }
        idsMusicas[posicao] = idMusica;
    }

    @Override
    public boolean isEmpty() {
        if (quantidadeMusicas == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if (quantidadeMusicas == idsMusicas.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int count() {
        return quantidadeMusicas;
    }

    @Override
    public void display() {
        System.out.print("[ ");
        for (int i = 0; i < quantidadeMusicas; i++) {
            System.out.print(idsMusicas[i] + " ");
        }
        System.out.println("]");
    }
}