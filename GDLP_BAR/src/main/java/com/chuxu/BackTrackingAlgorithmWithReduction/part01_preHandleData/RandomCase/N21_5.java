package com.chuxu.BackTrackingAlgorithmWithReduction.part01_preHandleData.RandomCase;

import com.chuxu.entity.Facility;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class N21_5 {
    public static int dimension = 21;
    public static final double[] ci =
            {100.0, 525.0, 288.0, 974.0, 367.0, 673.0, 892.0, 811.0, 114.0, 516.0, 610.0, 266.0, 673.0, 849.0, 389.0, 427.0, 127.0, 717.0, 270.0, 995.0, 983.0};
    public static final double[] pi =
            {431.0, 679.0, 416.0, 769.0, 210.0, 775.0, 110.0, 683.0, 768.0, 385.0, 680.0, 484.0, 497.0, 910.0, 720.0, 571.0, 374.0, 823.0, 623.0, 227.0, 927.0};
    public static final LinkedHashSet<Facility> V = new LinkedHashSet<>();
    public static double[][] disMatrix = {
            {0.00, 134.10, 198.35, 104.77, 99.78, 97.32, 122.57, 80.91, 183.14, 194.22, 171.22, 129.17, 117.65, 126.25, 80.55, 168.62, 176.00, 166.59, 198.03, 109.26, 136.19},
            {134.10, 0.00, 83.87, 84.57, 113.58, 170.10, 110.75, 92.26, 108.09, 110.06, 137.21, 81.66, 169.64, 169.83, 96.72, 82.99, 90.90, 82.71, 114.24, 108.54, 102.39},
            {198.35, 83.87, 0.00, 170.10, 80.35, 131.36, 155.59, 188.04, 104.81, 136.19, 112.46, 156.95, 145.16, 123.29, 121.02, 81.90, 162.58, 164.64, 184.96, 115.67, 147.33},
            {104.77, 84.57, 170.10, 0.00, 113.99, 97.40, 106.41, 199.73, 118.54, 104.29, 84.53, 110.60, 189.67, 92.90, 159.99, 116.20, 83.84, 123.61, 81.91, 107.79, 141.91},
            {99.78, 113.58, 80.35, 113.99, 0.00, 100.72, 196.18, 115.15, 136.28, 148.12, 125.05, 195.56, 140.21, 100.90, 184.17, 106.35, 121.86, 121.40, 108.04, 159.35, 138.19},
            {97.32, 170.10, 131.36, 97.40, 100.72, 0.00, 161.00, 153.95, 129.17, 140.01, 134.02, 177.45, 175.00, 98.77, 129.97, 139.18, 157.07, 109.84, 123.65, 113.12, 163.84},
            {122.57, 110.75, 155.59, 106.41, 196.18, 161.00, 0.00, 154.01, 129.27, 100.61, 195.04, 189.88, 145.89, 92.47, 88.07, 84.99, 195.68, 183.11, 171.97, 131.82, 184.98},
            {80.91, 92.26, 188.04, 199.73, 115.15, 153.95, 154.01, 0.00, 86.02, 102.95, 177.07, 99.83, 129.24, 119.49, 118.85, 183.75, 82.24, 112.73, 136.22, 154.72, 182.38},
            {183.14, 108.09, 104.81, 118.54, 136.28, 129.17, 129.27, 86.02, 0.00, 199.03, 148.78, 161.79, 129.63, 106.86, 101.77, 138.52, 82.24, 168.94, 92.72, 81.40, 174.05},
            {194.22, 110.06, 136.19, 104.29, 148.12, 140.01, 100.61, 102.95, 199.03, 0.00, 163.34, 140.98, 85.79, 105.97, 193.25, 189.54, 110.15, 179.22, 115.82, 161.13, 131.36},
            {171.22, 137.21, 112.46, 84.53, 125.05, 134.02, 195.04, 177.07, 148.78, 163.34, 0.00, 97.59, 123.76, 86.77, 159.63, 88.39, 111.27, 164.26, 101.09, 138.87, 177.41},
            {129.17, 81.66, 156.95, 110.60, 195.56, 177.45, 189.88, 99.83, 161.79, 140.98, 97.59, 0.00, 88.27, 129.28, 175.11, 194.77, 80.41, 173.74, 184.51, 80.37, 139.22},
            {117.65, 169.64, 145.16, 189.67, 140.21, 175.00, 145.89, 129.24, 129.63, 85.79, 123.76, 88.27, 0.00, 154.84, 81.15, 88.43, 124.48, 128.17, 94.73, 140.74, 148.85},
            {126.25, 169.83, 123.29, 92.90, 100.90, 98.77, 92.47, 119.49, 106.86, 105.97, 86.77, 129.28, 154.84, 0.00, 190.36, 149.44, 120.80, 132.42, 120.03, 88.12, 181.49},
            {80.55, 96.72, 121.02, 159.99, 184.17, 129.97, 88.07, 118.85, 101.77, 193.25, 159.63, 175.11, 81.15, 190.36, 0.00, 121.39, 83.18, 170.08, 93.79, 82.16, 82.28},
            {168.62, 82.99, 81.90, 116.20, 106.35, 139.18, 84.99, 183.75, 138.52, 189.54, 88.39, 194.77, 88.43, 149.44, 121.39, 0.00, 107.74, 95.49, 155.78, 130.96, 167.31},
            {176.00, 90.90, 162.58, 83.84, 121.86, 157.07, 195.68, 82.24, 82.24, 110.15, 111.27, 80.41, 124.48, 120.80, 83.18, 107.74, 0.00, 103.68, 194.60, 153.65, 103.50},
            {166.59, 82.71, 164.64, 123.61, 121.40, 109.84, 183.11, 112.73, 168.94, 179.22, 164.26, 173.74, 128.17, 132.42, 170.08, 95.49, 103.68, 0.00, 174.16, 164.49, 100.11},
            {198.03, 114.24, 184.96, 81.91, 108.04, 123.65, 171.97, 136.22, 92.72, 115.82, 101.09, 184.51, 94.73, 120.03, 93.79, 155.78, 194.60, 174.16, 0.00, 85.49, 162.89},
            {109.26, 108.54, 115.67, 107.79, 159.35, 113.12, 131.82, 154.72, 81.40, 161.13, 138.87, 80.37, 140.74, 88.12, 82.16, 130.96, 153.65, 164.49, 85.49, 0.00, 120.40},
            {136.19, 102.39, 147.33, 141.91, 138.19, 163.84, 184.98, 182.38, 174.05, 131.36, 177.41, 139.22, 148.85, 181.49, 82.28, 167.31, 103.50, 100.11, 162.89, 120.40, 0.00},
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
