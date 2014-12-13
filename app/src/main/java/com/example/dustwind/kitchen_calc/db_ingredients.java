package com.example.dustwind.kitchen_calc;

/**
 * Created by dustwind on 05.12.2014.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class db_ingredients extends SQLiteOpenHelper {
    public db_ingredients(Context context) {
        super(context, "db_ingredients", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table table_ingredients (" +
                        "id integer primary key autoincrement," +
                        "ingredient text," +
                        "g_ml double," +
                        "g_ss double," +
                        "g_bs double," +
                        "g_c double);"
        );

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('абрикосы , сушеные','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('анчоусы','1.02','5.1','15.3','240')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('арахис, измельченный','0.68','3.4','10.2','160')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('арахисовое масло','0.76','3.8','11.4','180')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('базилик, сушеный','0.11','0.5','1.6','25')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('бананы, нарезанные','0.76','3.8','11.4','180')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('бананы, пюре','0.97','4.9','14.6','230')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('бисквитная смесь','0.55','2.8','8.3','130')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('бразильские орехи, цельные','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('ванильные вафли, измельченные','0.68','3.4','10.2','160')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('взбитые яйца','0.97','4.9','14.6','230')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('виноградные орехи','0.51','2.5','7.6','120')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('вода','1.00','5.0','15.1','237')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('гвоздика, молотая','0.40','2.0','6.0','95')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('гвоздика, целая','0.38','1.9','5.7','90')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('говядина, приготовленная','0.97','4.9','14.6','230')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('говядина, сырая','0.93','4.7','14.0','220')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('горох, сырой','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('горчица, приготовленная','1.06','5.3','15.9','250')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('горчица, сухая','0.49','2.4','7.3','115')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('горчичное семя','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('грецкие орехи, молотые','0.36','1.8','5.4','85')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('грецкие орехи, нарезанные','0.49','2.4','7.3','115')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('грецкие орехи, очищенные от скорлупы','0.51','2.5','7.6','120')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('гречневая крупа','0.72','3.6','10.8','170')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('грибы, китайский черный','0.21','1.1','3.2','50')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('грибы, нарезанные','0.32','1.6','4.8','75')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('грибы, строганые','0.28','1.4','4.1','65')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('грибы, целые','0.25','1.3','3.8','60')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('дрожжи сухие активные','1.23','6.1','18.4','290')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('душистый перец',' 0.42',' 2.1','6.4','100')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('желатин','0.93','4.7','14.0','220')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('зеленый лук','0.21','1.1','3.2','50')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('зефир, маленький','0.21','1.1','3.2','50')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('изюм','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('имбирь, кристалл','1.02','5.1','15.3','240')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('имбирь, молотый','0.51','2.5','7.6','120')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('имбирь, свежий','0.97','4.9','14.6','230')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('инжир, сушеный','0.70','3.5','10.5','165')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('капуста , измельченная','1.44','7.2','21.6','340')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('картофель, нарезанный сырой','0.76','3.8','11.4','180')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('картофель, приготовленный нарезанный кубиками','0.85','4.2','12.7','200')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('картофельное пюре','0.89','4.4','13.3','210')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('кедровые орешки','0.53','2.6','7.9','125')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('киш-миш','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('клубника','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('клюква','0.42','2.1','6.4','100')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('кокосовая стружка, измельченная','0.32','1.6','4.8','75')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('корица, молотая','0.51','2.5','7.6','120')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('кофе, молотый','0.38','1.9','5.7','90')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('кофе, растворимый','0.23','1.2','3.5','55')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('крекер','0.25','1.3','3.8','60')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('кукуруза','0.72','3.6','10.8','170')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('кукурузная мука','0.51','2.5','7.6','120')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('кукурузный крахмал','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('куркума, молотая','0.59','3.0','8.9','140')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('лук, нарезанный','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('лук, рубленый','0.85','4.2','12.7','200')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('лук, строганный','0.55','2.8','8.3','130')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('лук-шалот','1.02','5.1','15.3','240')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('майонез','0.93','4.7','14.0','220')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('макаронные изделия, макароны','0.49','2.4','7.3','115')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('макаронные изделия, яичная лапша','0.38','1.9','5.7','90')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('маранта','0.95','4.8','14.3','225')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('маргарин, твердый','0.93','4.7','14.0','220')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('маргарин, топленый','0.89','4.4','13.3','210')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('мармелад','0.68','3.4','10.2','160')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('масло','0.97','4.9','14.6','230')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('масло кешью','0.47','2.3','7.0','110')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('масло, растительное','0.89','4.4','13.3','210')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('мед','1.44','7.2','21.6','340')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('миндаль, молотый','0.36','1.8','5.4','85 ')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('миндаль, целый','0.72','3.6','10.8','170 ')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('молоко, сухое','0.49','2.4','7.3','115')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('мука','0.55','2.8','8.3','130')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('мука из цельной пшеницы','0.55','2.8','8.3','130')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('мука, бобовых','0.55','2.8','8.3','130')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('мука, гречневая','0.72','3.6','10.8','170')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('мука, картофельная','0.72','3.6','10.8','170')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('мука, манной крупы','0.74','3.7','11.1','175')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('мука, пшеничная','0.42','2.1','6.4','100')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('мука, ржаная','0.38','1.9','5.7','90')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('мука, рисовая','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('овес, прессованый','0.34','1.7','5.1','80')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('овсянка, сырая','0.34','1.7','5.1','80')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('оливки нарезанные','0.76','3.8','11.4','180')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('оливковое масло','0.81','4.0','12.1','190')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('орехи пекан, мелко нарезанные','0.51','2.5','7.6','120')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('орехи пекан, молотые','0.42','2.1','6.4','100')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('орехи пекан, очищенные от скорлупы','0.51','2.5','7.6','120')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('отруби , непросеянные','0.23','1.2','3.5','55')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('паприка','0.49','2.4','7.3','115')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('патока','1.48','7.4','22.2','350')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('пекарский порошок','0.76','3.8','11.4','180')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('перец горошком, белый','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('перец горошком, черный','0.57','2.9','8.6','135')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('перец, нарезанный Чили','0.72','3.6','10.8','170')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('петрушка, свежая','0.17','0.8','2.5','40')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('печенье измельченное','0.51','2.5','7.6','120')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('побеги бамбука','1.14','5.7','17.2','270')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('помидоры, нарезанные','0.68','3.4','10.2','160')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('пшеница','0.53','2.6','7.9','125')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('рис','0.09','0.5','1.4','22')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('рис, дикий','0.61','3.1','9.2','145')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('рис, сырой','0.89','4.4','13.3','210')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('рис, тушеный','0.68','3.4','10.2','160')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сало','0.93','4.7','14.0','220')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сахар, гранулированный','0.81','4.0','12.1','190')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сахар, кондитерский','0.55','2.8','8.3','130')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сахар, коричневый','0.85','4.2','12.7','200')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сгущенное молоко','0.93','4.7','14.0','220')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('семена кунжута','0.68','3.4','10.2','160')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('семена мака','0.57','2.9','8.6','135')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('семя сельдерея','0.51','2.5','7.6','120')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сироп, кукурузный','1.48','7.4','22.2','350')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сладкий картофель, приготовленный','1.02','5.1','15.3','240')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сладкий картофель, сырой','0.76','3.8','11.4','180')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сметана','0.51','2.5','7.6','120')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('смородина','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сода','0.87','4.3','13.0','205')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('соль','1.02','5.1','15.3','240')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('соус Тартар','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('спагетти, сырые','0.51','2.5','7.6','120')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сыр Колби, тертый','0.47','2.3','7.0','110')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сыр, Джек, тертый','0.55','2.8','8.3','130')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сыр, сливочный','1.02','5.1','15.3','240')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сыр, творожный','0.97','4.9','14.6','230')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сыр, тертый пармезан','0.76','3.8','11.4','180')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('сыр, чеддер, тертый','0.51','2.5','7.6','120')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('тунец, консервы','0.85','4.2','12.7','200')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('тыква, приготовленная','0.76','3.8','11.4','180')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('фарина','0.76','3.8','11.4','180')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('фасоль , сушеная','0.85','4.2','12.7','200')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('фундук, цельный','0.72','3.6','10.8','170')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('хлебная панировка , свежий','0.25','1.3','3.8','60')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('цветная капуста ','0.97','4.9','14.6','230')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('цедра апельсина, тертая','0.38','1.9','5.7','90')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('цедра лимонная, тертая','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('цукаты апельсиновой цедры','0.53','2.6','7.9','125')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('цукаты лимонной цедры','0.57','2.9','8.6','135')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('чай','0.32','1.6','4.8','75')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('чеснок','0.68','3.4','10.2','160')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('чеснок, мелко нарезанный свежий','0.21','1.1','3.2','50')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('чеснок, нарезанный сушеный','0.03','0.2','0.5','8')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('чеснок, рубленый','0.64','3.2','9.5','150')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('чечевица','0.85','4.2','12.7','200')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('шоколад, какао-порошок','0.47','2.3','7.0','110')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('шоколад, растопленный','1.02','5.1','15.3','240')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('шоколад, тертый','0.42','2.1','6.4','100')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('шоколадная стружка','0.76','3.8','11.4','180')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('шпинат, приготовленный','0.76','3.8','11.4','180')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('яблоки, нарезанные','0.76','3.8','11.4','180')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('яблоки, сушеные','0.38','1.9','5.7','90')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('яичные белки','0.93','4.7','14.0','220')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('яичные желтки','1.14','5.7','17.2','270')");

        db.execSQL("INSERT INTO table_ingredients (ingredient,g_ml,g_ss,g_bs,g_c)" +

                "VALUES('ячмень, сырой','0.78','3.9','11.8','185')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
