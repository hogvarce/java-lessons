package ru.getjavajob.mamedov.homework2;
/**
 * Created by Ganzhenko on 21.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Conus conus = new Conus();
        conus.setRadius(10);
        conus.setHeight(20);
        System.out.println(conus.toSting() + " - площадь основания: " + conus.getRadiusBase());
        System.out.println(conus.toSting() + " - объем: " + conus.getVolume());

        System.out.println("------------------------");

        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(20);
        cylinder.setRadius(10);
        System.out.println(cylinder.toSting() + " - площадь основания: " + cylinder.getRadiusBase());
        System.out.println(cylinder.toSting() + " - объем: " + cylinder.getVolume());

        System.out.println("------------------------");

        Pyramid pyramid = new Pyramid();
        pyramid.setCornersCount(6);
        pyramid.setLength(15);
        pyramid.setHeight(20);
        System.out.println(pyramid.toSting() + " - площадь основания: " + pyramid.getAreaBase());
        System.out.println(pyramid.toSting() + " - объем: " + pyramid.getVolume());
    }
}
