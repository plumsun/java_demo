package com.study;

import java.io.*;
import java.util.Arrays;

/**
 * 稀疏数组实现
 *
 * @author LiHaoHan
 * @date 2023/1/12
 */
public class SparseArrayDemo {

    /**
     * 稀疏数组定义
     * 1.数组会有n行，3列
     * 2.第一行表示原数组有n行，n列，以及有效值的数量
     * 3.第二行到n行表示有效数据的坐标，以及具体的值
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        int[][] ints = new int[10][10];
        ints[0][3] = 10;
        ints[4][1] = 12;
        int[][] sparse = toSparse(ints);
        for (int[] arr : sparse) {
            System.out.println(Arrays.toString(arr));
        }
        saveFile(sparse);
        int[][] restore = restore(sparse);
        for (int[] ints1 : restore) {
            for (int i : ints1) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }
        int[][] file = readFile("D:\\sparse.map");
        for (int[] arr : file) {
            System.out.println(Arrays.toString(arr));
        }
    }

    /**
     * 二维数组 转换为 稀疏数组
     * 1.  遍历原始的二维数组，得到有效数据的个数num
     * 2.  根据num创建稀疏数组
     * 3.  将二维数组的有效数据存入到稀疏数组中
     *
     * @return
     */
    public static int[][] toSparse(int[][] arr) {
        //1.记录有效数据
        int count = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    count++;
                }
            }
        }
        /*
            2.创建稀疏数组
            有效数据的数量决定稀疏数组的大小和行数
            行数 = count + 1;
            列数 = 3;
         */
        int[][] sparseArr = new int[count + 1][3];
        sparseArr[0][0] = arr.length;
        sparseArr[0][1] = arr[0].length;
        sparseArr[0][2] = count;

        //3.将有效数据存入稀疏数组
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0) {
                    ++num;
                    sparseArr[num][0] = i;
                    sparseArr[num][1] = j;
                    sparseArr[num][2] = arr[i][j];
                }
            }
        }
        return sparseArr;
    }

    /**
     * 稀疏数组 转换为 二维数组
     * 1. 获取稀疏数组第一行数据，根据数据创建二维数组
     * 2. 遍历稀疏数组，根据稀疏数组中坐标将值存二维数组
     *
     * @return
     */
    public static int[][] restore(int[][] sparse) {
        // 1.通过稀疏数组中第一行数据创建二维数组
        // 行数
        int row = sparse[0][0];
        //列数
        int col = sparse[0][1];

        //2.遍历稀疏数组将有效数据存入二维数组
        int[][] arr = new int[row][col];
        for (int i = 1; i < sparse.length; i++) {
            //变量复用
            //行坐标
            row = sparse[i][0];
            //列坐标
            col = sparse[i][1];
            //值
            arr[row][col] = sparse[i][2];
        }
        return arr;
    }

    /**
     * 将稀疏数组存入文件
     *
     * @return 文件名
     */
    public static void saveFile(int[][] sparse) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\sparse.map"))) {
            for (int[] ints : sparse) {
                writer.write(Arrays.toString(ints));
                writer.newLine();
            }
            writer.flush();
        }
    }


    /**
     * 将稀疏数组存入文件
     *
     * @return 文件名
     */
    public static int[][] readFile(String file) throws IOException {
        try (BufferedReader read = new BufferedReader(new FileReader(file))) {
            //1.通过缓冲流取出文件中每一行数据，并记录行数
            StringBuilder builder = new StringBuilder();
            int num = 0;
            while (read.ready()) {
                String line = read.readLine().replace("[", "").replace(" ", "");
                builder.append(line);
                num++;
            }
            //2.通过行数创建稀疏数组
            int[][] ints = new int[num][3];
            String[] split = builder.toString().split("]");
            String[] arr;
            //3.通过行数进行遍历，并将字符数据进行转换赋值给稀疏数组
            for (int i = 0; i < num; i++) {
                arr = split[i].split(",");
                ints[i] = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
            }
            return ints;
        }
    }
}
