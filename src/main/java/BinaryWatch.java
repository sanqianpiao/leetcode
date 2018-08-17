import java.text.DecimalFormat;
import java.util.*;

public class BinaryWatch {
    public List<String> readBinaryWatch(int num) {
        float a[] = {1, 2, 4, 8, 0.32f, 0.16f, 0.08f, 0.04f, 0.02f, 0.01f};

        List<String> t = new ArrayList<>();
        Set<Float> set = new HashSet<>();
        mutiply(a, 0, 0, num, set);

        if (set.size() == 0 && num == 0) {
            set.add(0.0f);
        }

        set.stream().sorted().forEach((time) -> t.add(String.format("%.2f", time).replace(".", ":")));
        return t;
    }

    private void mutiply(float[] a, int startIndex, float multiplier, int depth, Set<Float> set) {
        if (--depth < 0) return;

        DecimalFormat form = new DecimalFormat("0.00");
        for (int i = startIndex; i < a.length; i++) {
            float tmp = multiplier + a[i];

            // be careful, float subtraction could cause data inaccuracy
            if ((int) tmp > 11 || Float.parseFloat(form.format(tmp - (int) tmp)) > 0.59f) {
                continue;
            }

            if (depth == 0) {
                set.add(tmp);
            } else {
                mutiply(a, i + 1, tmp, depth, set);
            }
        }
    }

}
