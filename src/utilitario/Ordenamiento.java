package utilitario;

import java.util.ArrayList;

public class Ordenamiento {
    public void ordernarBurbuja(ArrayList<iComparable> objs) {
        boolean huboCambio;
        do {
            huboCambio = false;
            for (int i = 0; i < objs.size() - 1; i++) {
                if (!objs.get(i).menorQue(objs.get(i + 1))) {
                    iComparable temp = objs.get(i);
                    objs.set(i, objs.get(i + 1));
                    objs.set(i + 1, temp);
                    huboCambio = true;
                }
            }
        } while (huboCambio);
    }
}
