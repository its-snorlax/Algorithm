package coursera.week1;

public class QuickFindUF {
    private int[] id;
    private int[] size;

    public QuickFindUF(int size) {
        this.id = new int[size];
        for (int i = 0; i < size; i++) {
            this.id[i] = i;
        }
        this.size = new int[size];
        for (int i = 0; i < size; i++) {
            this.size[i] = 0;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (size[i] < size[j]) {
            id[i] = j;
            size[j] = size[j] + size[i];
        } else {
            id[j] = i;
            size[i] = size[i] + size[j];
        }
    }

    public int find(int[] components) {
        int max=0;
        for (int component : components) {
            if (component > max) {
                max = component;
            }
        }
        return max;
    }
}
