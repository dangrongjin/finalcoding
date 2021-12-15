
    public class Pell {
        public Pell() {
        }

        public long get(int s) {
            if (s < 0) {
                throw new UnsupportedOperationException("Pell.get is not supported for negative n");
            } else if (s == 0) {
                return 0L;
            } else if (s == 1) {
                return 1L;
            } else {
                long[] arr = new long[s + 1];
                arr[0] = 0L;
                arr[1] = 1L;

                for(int i = 2; i <= s; ++i) {
                    arr[i] = 2L * arr[i - 1] + arr[i - 2];
                }

                return arr[s];
            }
        }
    }


