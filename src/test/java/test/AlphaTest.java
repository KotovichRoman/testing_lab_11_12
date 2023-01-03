package test;

import page.*;
import org.testng.annotations.Test;
import service.RegionCreator;

public class AlphaTest extends CommonConditions {
    @Test(description = "Найти самые популярные мужские чёрные бомберы размера XL")
    public void Test1(){
        new HomePage(driver).openPage()
                .openSearch()
                .openSearchResultPage("bomber")
                .filtersButtonClick()
                .selectBlackColor()
                .selectXLSize()
                .filtersButtonClick()
                .openOrderByDropdownMenu()
                .selectOrderByMostPopular();
    }

    @Test(description = "Найти мужскую верхнюю одежду белого цвета и отсортировать от самых дешёвых")
    public void Test2() {
        new HomePage(driver).openPage()
                .openMenPage()
                .openMensOuterwearPage()
                .clickToColorFilter()
                .selectWhiteColor()
                .clickToProductTypeFilter()
                .selectOuterwearProductType()
                .clickToSortByDropdownMenu()
                .selectPriceLowToHighElement();
    }

    @Test(description = "Найти все сумки чёрного цвета и отсортировать по самым продаваемым")
    public void Test3() {
        new HomePage(driver).openPage()
                    .openBagsPage()
                    .clickToColorFilter()
                    .selectBlackColor()
                    .clickToSortByDropdownMenu()
                    .selectBestSellingElement();
    }

    @Test(description = "Добавить в корзину несколько одинаковых сумок")
    public void Test4() {
        new HomePage(driver).openPage()
                    .openBagsPage()
                    .openBagsItem()
                    .addItemToCart()
                    .openQuantityDropdownMenu()
                    .selectQuantity()
                    .addItemToCart();
    }

    @Test(description = "Найти самую популярную куртку размера 2XL и добавить его в корзину")
    public void Test5() {
        new HomePage(driver).openPage()
                        .openMenPage()
                        .openMensOuterwearPage()
                        .clickToProductTypeFilter()
                        .selectOuterwearProductType()
                        .clickToSizeFilter()
                        .selectTwoXLSize()
                        .clickToSortByDropdownMenu()
                        .selectBestSellingElement()
                        .openOuterwearFirstItem()
                        .select2XLSize()
                        .addItemToCart();
    }

    @Test(description = "Удаление всех элементов из корзины")
    public void Test6() {
        new HomePage(driver).openPage()
                        .openMenPage()
                        .openFirstMenItem()
                        .select2XLSize()
                        .addItemToCart()
                        .openCartPage()
                        .deleteItemInCart();
    }

    @Test(description = "Найти новые вещи чёрного цвета, которые сейчас на распродаже")
    public void Test7() {
        new HomePage(driver).openPage()
                        .openSalePage()
                        .clickToColorFilter()
                        .selectBlackColor()
                        .clickToSortByDropdownMenu()
                        .selectNewestElement();
    }

    @Test(description = "Добавить в корзину три вещи, после чего добавить те же вещи в такой же последовательности")
    public void Test8() {
        new HomePage(driver).openPage()
                        .openMenPage()
                        .openFirstMenItem()
                        .select2XLSize()
                        .addItemToCart()
                        .openMenPage()
                        .openSecondMenItem()
                        .select2XLSize()
                        .addItemToCart()
                        .openMenPage()
                        .openThirdMenItem()
                        .select2XLSize()
                        .addItemToCart()
                        .openMenPage()
                        .openFirstMenItem()
                        .select2XLSize()
                        .addItemToCart()
                        .openMenPage()
                        .openSecondMenItem()
                        .select2XLSize()
                        .addItemToCart()
                        .openMenPage()
                        .openThirdMenItem()
                        .select2XLSize()
                        .addItemToCart();
    }

    @Test(description = "Добавить две одинаковые вещи с разным цветом")
    public void Test9() {
        new HomePage(driver).openPage()
                        .openMenPage()
                        .openFirstMenItem()
                        .select2XLSize()
                        .addItemToCart()
                        .selectBlackColor()
                        .selectXSSize()
                        .addItemToCart();
    }

    @Test(description = "Добавить три одинаковые куртки с разным цветом и размером")
    public void Test10() {
        new HomePage(driver).openPage()
                        .openMenPage()
                        .openMensOuterwearPage()
                        .openOuterwearFirstItem()
                        .select2XLSize()
                        .addItemToCart()
                        .selectBlackColor()
                        .selectXSSize()
                        .addItemToCart();
    }
}