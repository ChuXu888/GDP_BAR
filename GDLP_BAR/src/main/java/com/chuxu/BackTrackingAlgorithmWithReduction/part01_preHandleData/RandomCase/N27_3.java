package com.chuxu.BackTrackingAlgorithmWithReduction.part01_preHandleData.RandomCase;

import com.chuxu.entity.Facility;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class N27_3 {
    public static int dimension = 27;
    public static final double[] ci =
            {438.0,166.0,512.0,422.0,193.0,190.0,655.0,220.0,912.0,141.0,519.0,398.0,720.0,736.0,622.0,618.0,124.0,483.0,307.0,609.0,120.0,750.0,333.0,501.0,383.0,873.0,636.0};
    public static final double[] pi =
            {979.0,157.0,549.0,989.0,209.0,661.0,620.0,793.0,821.0,171.0,681.0,442.0,920.0,274.0,296.0,745.0,231.0,456.0,136.0,327.0,171.0,543.0,774.0,802.0,105.0,421.0,186.0};
    public static final LinkedHashSet<Facility> V = new LinkedHashSet<>();
    public static double[][] disMatrix = {
            {   0.00, 176.65, 189.39, 119.75, 152.07, 185.33,  86.61, 145.75, 118.81, 168.22, 127.13, 153.05,  97.03,  99.49, 142.10, 112.54, 100.39, 172.28, 189.12, 196.49,  80.19, 192.08, 170.14, 137.63, 155.52, 198.52, 159.27},
            { 176.65,   0.00, 186.21,  83.21, 179.19, 101.37, 157.80, 179.95, 125.34, 131.14,  82.43,  84.49, 119.67, 194.78, 177.98, 146.74, 120.07, 131.88, 156.30,  93.93, 130.86, 135.73, 190.11, 190.22, 174.45, 153.08, 181.91},
            { 189.39, 186.21,   0.00,  96.91,  91.57, 112.20,  83.16, 134.41, 146.80, 198.86, 192.78, 125.24, 139.07, 134.82, 178.40, 138.63, 172.93, 111.75,  92.07, 103.29, 156.68, 136.19, 174.29,  83.51, 137.17, 166.74, 115.62},
            { 119.75,  83.21,  96.91,   0.00, 107.09, 198.77, 174.89, 195.06, 150.21, 165.47,  94.14,  97.17, 144.44, 109.89,  99.66, 107.33, 155.94, 172.26, 101.49, 194.89, 154.01, 104.70,  99.28, 138.83, 158.63, 122.66, 175.18},
            { 152.07, 179.19,  91.57, 107.09,   0.00, 128.43, 111.37, 145.49, 113.49, 103.66, 193.80, 181.92,  92.14, 125.81, 159.95, 183.91, 190.56,  88.06, 156.57, 193.66,  82.13,  89.27, 114.84, 123.70, 186.92,  81.11, 151.79},
            { 185.33, 101.37, 112.20, 198.77, 128.43,   0.00, 118.78, 191.05, 119.29, 117.44, 191.15, 114.31, 144.47, 105.23,  96.65, 145.77, 166.13, 169.02, 149.96, 189.86, 105.42,  98.86, 140.30, 110.94,  87.91, 140.88, 147.26},
            {  86.61, 157.80,  83.16, 174.89, 111.37, 118.78,   0.00, 154.76, 187.40, 163.08, 107.40, 118.26, 104.65,  89.47, 127.43,  96.75, 182.26,  89.05, 138.73, 178.61, 107.35, 134.08, 180.57, 122.07, 198.50,  93.84, 105.73},
            { 145.75, 179.95, 134.41, 195.06, 145.49, 191.05, 154.76,   0.00, 117.70, 151.38, 145.29, 142.24,  92.25, 169.63,  81.61, 119.10, 125.41, 173.37, 122.05, 151.18, 191.29, 136.92, 193.65,  99.93, 159.54, 120.92, 125.44},
            { 118.81, 125.34, 146.80, 150.21, 113.49, 119.29, 187.40, 117.70,   0.00, 181.84, 118.57, 110.78,  90.27, 165.17,  94.38, 154.17, 106.95, 198.28, 133.13, 144.91, 197.52, 129.22, 134.48, 128.60, 119.40,  86.30, 124.60},
            { 168.22, 131.14, 198.86, 165.47, 103.66, 117.44, 163.08, 151.38, 181.84,   0.00,  87.55, 141.77, 173.27,  84.18, 118.25, 108.32, 110.42, 116.41, 183.95, 184.95,  84.12, 173.34, 168.52, 191.91, 152.53, 116.67, 134.29},
            { 127.13,  82.43, 192.78,  94.14, 193.80, 191.15, 107.40, 145.29, 118.57,  87.55,   0.00, 103.61, 134.24, 169.69, 137.79,  87.45,  98.76, 142.18, 121.34, 184.72, 104.78, 138.44, 157.15,  92.06, 171.53, 191.10, 152.06},
            { 153.05,  84.49, 125.24,  97.17, 181.92, 114.31, 118.26, 142.24, 110.78, 141.77, 103.61,   0.00, 160.99, 183.20, 119.32, 107.38, 176.06, 153.24,  89.66,  87.23,  99.03, 177.33, 101.84, 142.38, 136.50, 198.55, 128.45},
            {  97.03, 119.67, 139.07, 144.44,  92.14, 144.47, 104.65,  92.25,  90.27, 173.27, 134.24, 160.99,   0.00, 123.51,  82.98, 117.42, 149.05, 118.37, 189.16,  81.77, 193.78,  82.10, 126.77, 188.15, 190.23, 137.99,  86.89},
            {  99.49, 194.78, 134.82, 109.89, 125.81, 105.23,  89.47, 169.63, 165.17,  84.18, 169.69, 183.20, 123.51,   0.00, 116.27, 169.45,  88.07,  97.94, 122.04, 113.23, 128.55, 162.09, 172.39,  94.55,  94.81, 185.97, 136.17},
            { 142.10, 177.98, 178.40,  99.66, 159.95,  96.65, 127.43,  81.61,  94.38, 118.25, 137.79, 119.32,  82.98, 116.27,   0.00,  96.55, 123.65, 161.62,  90.91, 152.70, 177.67, 198.10, 123.86, 192.04, 187.38, 171.81, 138.36},
            { 112.54, 146.74, 138.63, 107.33, 183.91, 145.77,  96.75, 119.10, 154.17, 108.32,  87.45, 107.38, 117.42, 169.45,  96.55,   0.00, 118.09, 191.01, 195.59,  83.03, 118.34, 150.35, 161.71, 181.34, 194.06, 172.96,  93.43},
            { 100.39, 120.07, 172.93, 155.94, 190.56, 166.13, 182.26, 125.41, 106.95, 110.42,  98.76, 176.06, 149.05,  88.07, 123.65, 118.09,   0.00, 113.00, 135.71, 196.68, 102.46, 126.23, 169.35, 152.04, 196.43, 141.34, 182.78},
            { 172.28, 131.88, 111.75, 172.26,  88.06, 169.02,  89.05, 173.37, 198.28, 116.41, 142.18, 153.24, 118.37,  97.94, 161.62, 191.01, 113.00,   0.00, 131.32, 130.89, 121.16,  87.78, 199.92, 114.66, 172.65, 125.42, 106.75},
            { 189.12, 156.30,  92.07, 101.49, 156.57, 149.96, 138.73, 122.05, 133.13, 183.95, 121.34,  89.66, 189.16, 122.04,  90.91, 195.59, 135.71, 131.32,   0.00, 135.05, 126.93, 136.63, 164.39, 131.28,  80.82, 158.52,  98.41},
            { 196.49,  93.93, 103.29, 194.89, 193.66, 189.86, 178.61, 151.18, 144.91, 184.95, 184.72,  87.23,  81.77, 113.23, 152.70,  83.03, 196.68, 130.89, 135.05,   0.00,  89.98, 173.66, 129.32, 107.02, 125.56, 156.65, 190.93},
            {  80.19, 130.86, 156.68, 154.01,  82.13, 105.42, 107.35, 191.29, 197.52,  84.12, 104.78,  99.03, 193.78, 128.55, 177.67, 118.34, 102.46, 121.16, 126.93,  89.98,   0.00, 128.01, 101.40, 129.74, 187.76,  99.47, 184.32},
            { 192.08, 135.73, 136.19, 104.70,  89.27,  98.86, 134.08, 136.92, 129.22, 173.34, 138.44, 177.33,  82.10, 162.09, 198.10, 150.35, 126.23,  87.78, 136.63, 173.66, 128.01,   0.00, 172.42, 194.13, 143.95, 105.44, 119.93},
            { 170.14, 190.11, 174.29,  99.28, 114.84, 140.30, 180.57, 193.65, 134.48, 168.52, 157.15, 101.84, 126.77, 172.39, 123.86, 161.71, 169.35, 199.92, 164.39, 129.32, 101.40, 172.42,   0.00, 179.92, 102.79, 104.44, 155.16},
            { 137.63, 190.22,  83.51, 138.83, 123.70, 110.94, 122.07,  99.93, 128.60, 191.91,  92.06, 142.38, 188.15,  94.55, 192.04, 181.34, 152.04, 114.66, 131.28, 107.02, 129.74, 194.13, 179.92,   0.00, 165.00, 178.07, 162.35},
            { 155.52, 174.45, 137.17, 158.63, 186.92,  87.91, 198.50, 159.54, 119.40, 152.53, 171.53, 136.50, 190.23,  94.81, 187.38, 194.06, 196.43, 172.65,  80.82, 125.56, 187.76, 143.95, 102.79, 165.00,   0.00, 119.31, 178.01},
            { 198.52, 153.08, 166.74, 122.66,  81.11, 140.88,  93.84, 120.92,  86.30, 116.67, 191.10, 198.55, 137.99, 185.97, 171.81, 172.96, 141.34, 125.42, 158.52, 156.65,  99.47, 105.44, 104.44, 178.07, 119.31,   0.00,  83.99},
            { 159.27, 181.91, 115.62, 175.18, 151.79, 147.26, 105.73, 125.44, 124.60, 134.29, 152.06, 128.45,  86.89, 136.17, 138.36,  93.43, 182.78, 106.75,  98.41, 190.93, 184.32, 119.93, 155.16, 162.35, 178.01,  83.99,   0.00},
    };
    public static final double φp = 0.3;  //本例中都取0.2是会得到性质7疯狂降阶的情况，然后通过性质4直接得到了最优解
    public static final double φc = 0.3;
    public static double P;
    public static double C;

    public static void main(String[] args) {
        preHandle();
    }

    public static void preHandle() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        P = Arrays.stream(pi).reduce(0.0, Double::sum) * φp;
        C = Arrays.stream(ci).reduce(0.0, Double::sum) * φc;
        P = Double.parseDouble(decimalFormat.format(P));
        C = Double.parseDouble(decimalFormat.format(C));
        System.out.println("P = " + P);
        System.out.println("C = " + C);
        for (int i = 0; i < pi.length; i++) {
            V.add(new Facility(i + 1, ci[i], pi[i], pi[i] / ci[i]));
        }
    }
}
