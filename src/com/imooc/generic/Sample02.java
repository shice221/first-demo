package com.imooc.generic;

import com.imooc.generic.comp02.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型作为方法参数
 */
public class Sample02 {

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        List<Clothes> clothesList = new ArrayList<>();
        List<Shoe>  shoeList = new ArrayList<>();
        bookList.add(new Book());
        bookList.add(new Book());
        clothesList.add(new Clothes());
        clothesList.add(new Clothes());
        shoeList.add(new Shoe());
        shoeList.add(new Shoe());

        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Book());
        goodsList.add(new Clothes());
        goodsList.add(new Shoe());

        GoodSeller goodSeller = new GoodSeller();

        goodSeller.sellGoods(bookList);
        goodSeller.sellGoods(clothesList);
        goodSeller.sellGoods(shoeList);

        goodSeller.sellGoods(goodsList);
    }

}
