package utilities;

public class Settings {

        //Island size
        public static int rowsCount = 5;
        public static int columnsCount = 5;

        //Wolf settings
        public static int wolfWeight = 50;
        public static int wolfMaxCellCount = 30;
        public static int wolfSpeed = 3;
        public static int wolfSaturation = 8;
        public static int wolfEatWolfProbability = 0;
        public static int wolfEatBoaProbability = 0;
        public static int wolfEatFoxProbability = 0;
        public static int wolfEatBearProbability = 0;
        public static int wolfEatEagleProbability = 0;
        public static int wolfEatHorseProbability = 10;
        public static int wolfEatDeerProbability = 15;
        public static int wolfEatRabbitProbability = 60;
        public static int wolfEatMouseProbability = 80;
        public static int wolfEatGoatProbability = 60;
        public static int wolfEatSheepProbability = 70;
        public static int wolfEatBoarProbability = 15;
        public static int wolfEatBuffaloProbability = 10;
        public static int wolfEatDuckProbability = 40;
        public static int wolfEatCaterpillarProbability = 0;
        public static int wolfEatPlantProbability = 0;

        //Boa settings
        public static int boaWeight = 15;
        public static int boaMaxCellCount = 30;
        public static int boaSpeed = 1;
        public static int boaSaturation = 3;
        public static int boaEatWolfProbability = 0;
        public static int boaEatBoaProbability = 0;
        public static int boaEatFoxProbability = 15;
        public static int boaEatBearProbability = 0;
        public static int boaEatEagleProbability = 0;
        public static int boaEatHorseProbability = 0;
        public static int boaEatDeerProbability = 0;
        public static int boaEatRabbitProbability = 20;
        public static int boaEatMouseProbability = 40;
        public static int boaEatGoatProbability = 0;
        public static int boaEatSheepProbability = 0;
        public static int boaEatBoarProbability = 0;
        public static int boaEatBuffaloProbability = 0;
        public static int boaEatDuckProbability = 10;
        public static int boaEatCaterpillarProbability = 0;

        //Fox settings
        public static int foxWeight = 8;
        public static int foxMaxCellCount = 30;
        public static int foxSpeed = 2;
        public static int foxSaturation = 2;
        public static final int foxEatWolfProbability = 0;
        public static final int foxEatBoaProbability = 0;
        public static final int foxEatFoxProbability = 0;
        public static final int foxEatBearProbability = 0;
        public static final int foxEatEagleProbability = 0;
        public static final int foxEatHorseProbability = 0;
        public static final int foxEatDeerProbability = 0;
        public static final int foxEatRabbitProbability = 70;
        public static final int foxEatMouseProbability = 90;
        public static final int foxEatGoatProbability = 0;
        public static final int foxEatSheepProbability = 0;
        public static final int foxEatBoarProbability = 0;
        public static final int foxEatBuffaloProbability = 0;
        public static final int foxEatDuckProbability = 60;
        public static final int foxEatCaterpillarProbability = 40;

        //Bear settings
        public static int bearWeight = 500;
        public static int bearMaxCellCount = 5;
        public static int bearSpeed = 2;
        public static int bearSaturation = 80;
        public static int bearEatWolfProbability = 0;
        public static int bearEatBoaProbability = 80;
        public static int bearEatFoxProbability = 0;
        public static int bearEatBearProbability = 0;
        public static int bearEatEagleProbability = 0;
        public static int bearEatHorseProbability = 40;
        public static int bearEatDeerProbability = 80;
        public static int bearEatRabbitProbability = 80;
        public static int bearEatMouseProbability = 90;
        public static int bearEatGoatProbability = 70;
        public static int bearEatSheepProbability = 70;
        public static int bearEatBoarProbability = 50;
        public static int bearEatBuffaloProbability = 20;
        public static int bearEatDuckProbability = 10;
        public static int bearEatCaterpillarProbability = 0;

        //Eagle settings
        public static int eagleWeight = 6;
        public static int eagleMaxCellCount = 20;
        public static int eagleSpeed = 3;
        public static int eagleSaturation = 1;
        public static int eagleEatWolfProbability = 0;
        public static int eagleEatBoaProbability = 0;
        public static int eagleEatFoxProbability = 10;
        public static int eagleEatBearProbability = 0;
        public static int eagleEatEagleProbability = 0;
        public static int eagleEatHorseProbability = 10;
        public static int eagleEatDeerProbability = 0;
        public static int eagleEatRabbitProbability = 90;
        public static int eagleEatMouseProbability = 90;
        public static int eagleEatGoatProbability = 0;
        public static int eagleEatSheepProbability = 0;
        public static int eagleEatBoarProbability = 0;
        public static int eagleEatBuffaloProbability = 0;
        public static int eagleEatDuckProbability = 80;
        public static int eagleEatCaterpillarProbability = 0;

        //Horse settings
        public static int horseWeight = 400;
        public static int horseMaxCellCount = 20;
        public static int horseSpeed = 4;
        public static int horseSaturation = 60;

        //Deer settings
        public static int deerWeight = 300;
        public static int deerMaxCellCount = 20;
        public static int deerSpeed = 4;
        public static int deerSaturation = 50;

        //Rabbit settings
        public static int rabbitWeight = 2;
        public static int rabbitMaxCellCount = 150;
        public static int rabbitSpeed = 2;
        public static double rabbitSaturation = 0.45;

        //Mouse settings
        public static double mouseWeight = 0.05;
        public static int mouseMaxCellCount = 500;
        public static int mouseSpeed = 1;
        public static double mouseSaturation = 0.01;
        public static int mouseEatCaterpillarProbability = 90;

        //Goat settings
        public static int goatWeight = 60;
        public static int goatMaxCellCount = 140;
        public static int goatSpeed = 3;
        public static int goatSaturation = 10;

        //Sheep settings
        public static int sheepWeight = 70;
        public static int sheepMaxCellCount = 140;
        public static int sheepSpeed = 3;
        public static int sheepSaturation = 15;

        //Boar settings
        public static int boarWeight = 400;
        public static int boarMaxCellCount = 50;
        public static int boarSpeed = 2;
        public static int boarSaturation = 50;
        public static final int boarEatCaterpillarProbability = 90;

        //Buffalo settings
        public static int buffaloWeight = 700;
        public static int buffaloMaxCellCount = 10;
        public static int buffaloSpeed = 3;
        public static int buffaloSaturation = 100;

        //Duck settings
        public static int duckWeight = 1;
        public static int duckMaxCellCount = 200;
        public static int duckSpeed = 4;
        public static double duckSaturation = 0.15;
        public static int duckEatCaterpillarProbability = 90;

        //Caterpillar settings
        public static double caterpillarWeight = 0.01;
        public static int caterpillarMaxCellCount = 1000;
        public static int caterpillarSpeed = 0;
        public static int caterpillarSaturation = 0;


}
