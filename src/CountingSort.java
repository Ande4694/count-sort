class CountingSort {
    void sort(int arr[]) {

        //Holder styr på hvor mange input der skal sorteres, bruges til output length
        int n = arr.length;

        //output array, er n langt
        int output[] = new int[n];

        //Nyt tælle array, der skal holde hvor mange af det enkelte tal der er, alle plasser sættes til 0
        int count[] = new int[9];
        for (int i = 0; i < 9; ++i)
            count[i] = 0;

        //tæller hvor mange af hvert tal der er
        for (int i = 0; i < n; ++i) {
            ++count[arr[i]];
        }

        //skifter mængden i count
        for (int i = 1; i <= 8; ++i)
            count[i] += count[i - 1];


        //fra højste indeks udfylder vi nu output-arrayet
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        //overskriver start array med output array
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }
}