import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PrisonSystem {
    private static int prisonersCount = 777;
    private static int guardsCount = 34;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static boolean isRiot = false;
    private static int playerHealth = 100;
    private static int enemyHealth = 100;

    public static void main(String[] args) {
        System.out.println("Вам говорит Волтер: -Наша тюрьма самая лучшая на свете, тут мы любим друг друга и точно не варим ничего. Тюрьму построили когда-то по приколу." +
                "                           _._\n" +
                "                               .-~ | ~-.\n" +
                "                               |   |   |\n" +
                "                               |  _:_  |                    .-:~--.._\n" +
                "                             .-\"~~ | ~~\"-.                .~  |      |\n" +
                "            _.-~:.           |     |     |                |   |      |\n" +
                "           |    | `.         |     |     |                |   |      |\n" +
                "  _..--~:-.|    |  |         |     |     |                |   |      |\n" +
                " |      |  ~.   |  |         |  __.:.__  |                |   |      |\n" +
                " |      |   |   |  |       .-\"~~   |   ~~\"-.              |   |      |\n" +
                " |      |   |  _|.--~:-.   |       |       |         .:~-.|   |      |\n" +
                " |      A   | |      |  ~. |       |   _.-:~--._   .' |   |   |      |\n" +
                " |      M   | |      |   | |       |  |   |     |  |  |   |   |      |\n" +
                " |      C   | |      |   | |       |  |   |     |  |  |   |   |      |\n" +
                " |      |   | |      |   | |       |  |   |     |  |  |   |   |      |\n" +
                " |      9   | |      |   | |       |  |   |     |  |  |   |   |      |\n" +
                " |      9   | |      |   | |       |  |   |     |  |  |   |   |      |\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        System.out.println("Хотите узнать больше информации? (да/нет)");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {
            System.out.println("Отлично! Давайте перейдем к выбору действий.");
        } else {
            System.out.println("Чтож Фраер, зря ты так грубо ответил на мое гостеприимство...");
            System.out.println("*звуки* *крик* *молчание...*");
            printSkull();
            System.out.println("Game Over");
            System.exit(0);
        }

        boolean exit = false;
        while (!exit) {
            if (!isRiot && random.nextInt(100) + 1 <= 30) {
                isRiot = true;
                handleRiot();
            }

            System.out.println("Выберите действие:");
            System.out.println("1. Посмотреть отчет о преступнике");
            System.out.println("2. Посмотреть количество заключенных");
            System.out.println("3. Поговорить с охранниками по душам");
            System.out.println("4. Посмотреть количество охранников");
            System.out.println("5. Нанять дополнительных охранников");
            System.out.println("6. Посмотреть часы работы тюрьмы для посещений");
            System.out.println("7. Выйти из программы");
            System.out.print("Ваш выбор: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewPrisonerReport();
                    break;
                case 2:
                    showPrisonersCount();
                    break;
                case 3:
                    talkToGuards();
                    break;
                case 4:
                    System.out.println("Количество охранников в тюрьме: " + guardsCount);
                    break;
                case 5:
                    hireGuards();
                    break;
                case 6:
                    showVisitingHours();
                    break;
                case 7:
                    exit = true;
                    System.out.println("Программа завершена. Добро пожаловать в детский садик.");
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }

        scanner.close();
    }

    private static void viewPrisonerReport() {
        System.out.print("Введите номер заключенного: ");
        int prisonerNumber = scanner.nextInt();
        if (prisonerNumber < 1 || prisonerNumber > prisonersCount) {
            System.out.println("Неверный номер заключенного.");
            return;
        }
        System.out.println("Отчет о заключенном №" + prisonerNumber + ":");
        System.out.println("Имя: " + generateRandomName());
        System.out.println("Возраст: " + generateRandomAge());
        System.out.println("Преступление: " + generateRandomCrime());

        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.println("\nВам говорит Волтер: -Чтож это один из наших заключенных, как насчёт того, чтобы посмотреть дополнительные информации в тюрьме и может что-то изменить? Конечно это бесплатно мой дорогой друг >:))");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void showPrisonersCount() {
        System.out.println("Количество заключенных в тюрьме: " + prisonersCount);
    }private static void talkToGuards() {
        System.out.println("Сворфард:");
        System.out.println("Сэр да Сэр!");
        System.out.println("Ты что строишь мне глазки, малыш?");
        System.out.println("Строишь?");
        System.out.println("Сэр да Сэр");
        System.out.println("Значит считаешь к лицу мне эта форма Сворфард?");
        System.out.println("Сэр вы смотритесь в форме сержанта шикарно сэр.");
        System.out.println("А, так ты втюрился в меня?");
        System.out.println("Сэр да Сэр!");
        System.out.println("Сэр я гомик Сэр!");
        System.out.println("Есть у тебя подружка Свофард?");
        System.out.println("Сэр нет Сэр!");
        System.out.println("Отлично, малыш. Отжаться 25 раз за каждую палку, которую мне вставят за месяц! А ну рожей в пол! Малыш))))");
    }

    private static void hireGuards() {
        System.out.print("Сколько охранников вы хотите нанять? ");
        int additionalGuards = scanner.nextInt();
        guardsCount += additionalGuards;
        System.out.println("Нанято дополнительных охранников. Теперь их количество: " + guardsCount);
    }

    private static void showVisitingHours() {
        System.out.println("Часы работы тюрьмы для посещений:");
        System.out.println("Понедельник: 12:00-14:00");
        System.out.println("Вторник: 16:00-17:00");
        System.out.println("Среда: Нет посещений");
        System.out.println("Четверг: 10:00-13:00");
        System.out.println("Пятница: 18:00-18:45");
        System.out.println("Суббота: Выходной");
        System.out.println("Воскресенье: Выходной");
    }

    private static void handleRiot() {
        System.out.println("\nВ тюрьме начался бунт!");

        while (playerHealth > 0 && enemyHealth > 0) {
            System.out.println("\nВаше здоровье: " + playerHealth);
            System.out.println("Здоровье противника: " + enemyHealth);
            System.out.println("Выберите действие:");
            System.out.println("1. Атаковать");
            System.out.println("2. Защищаться");
            System.out.print("Ваш выбор: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int damageDealt = random.nextInt(20);
                    int damageTaken = random.nextInt(15);
                    enemyHealth -= damageDealt;
                    playerHealth -= damageTaken;
                    System.out.println("Вы нанесли " + damageDealt + " урона противнику.");
                    System.out.println("Противник нанес вам " + damageTaken + " урона.");
                    break;
                case 2:
                    int enemyDamage = random.nextInt(10);
                    playerHealth -= enemyDamage;
                    System.out.println("Вы защищаетесь, но противник всё равно наносит вам " + enemyDamage + " урона.");
                    break;
                default:
                    System.out.println("Неверный ввод.");
            }

            if (playerHealth <= 0) {
                System.out.println("\nВы проиграли. Бунт в тюрьме непрекращаем.");
                gameOverDialog();
                break;
            } else if (enemyHealth <= 0) {
                System.out.println("\nВы победили! Бунт подавлен, контроль в тюрьме восстановлен.");
                victoryDialog();
                isRiot = false;
                break;
            }
        }
    }

    private static void gameOverDialog() {
        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.println("\nВам говорит Волтер: -Что ж, кое-как я нас вытащил, когда тебя вырубили. Но это теперь не наша проблема, а проблема полиции. \n" +
                    "                    ____            ____            ____\n" +
                    "                   /....\\          /....\\          /....\\\n" +
                    "           .-.    |::::::|    .-. |::::::|    .-. |::::::|\n" +
                    "           | |    |::::::|    | | |::::::|    | | |::::::|\n" +
                    "           | |    (`:'':')    | | (`:'':')    | | (`:'':')\n" +
                    "           | |   _--|__|--__  | |.--|__|--__  | |_--|__|--__\n" +
                    "           | |  |   ________|_|_|_  ________|_|_|_  ________|_____\n" +
                    "           | | /    |            |  |            |  |            |\n" +
                    "           | |/  /  |            |  |            |  |            |\n" +
                    "           |_| |/|  |            |  |            |  |            |\n" +
                    "          (===)| |  |  M  U  P   |  |  M  U  P   |  |  M  U  P   |\n" +
                    "          `==='  |`-|            |`-|            |`-|            |\n" +
                    "           | |   |`-|            |`-|            |`-|            |\n" +
                    "           |_|   |  |            |  |            |  |            |\n" +
                    "                 |  |            |  |            |  |            |\n" +
                    "                 |  |            |  |            |  |            |\n" +
                    "                 |`-|            |`-|            |`-|            |\n" +
                    "                 |__|            |__|            |__|            |\n" +
                    "                 /_ |            |_ |            |_ |            |\n" +
                    "                |___`-__________-'__`-__________-'__`-__________-'\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printSkull();
        System.out.println("Game Over" +
                " __________________________\n" +
                "        /   | |______| |___     __/ \n" +
                "       /  , | |  /\\  | | ^ |   |       ,--.  \n" +
                "     ,' ,'| | |.'  `.| |/ \\|   |      /    \\  \n" +
                "   ,' ,'__| | |______| |___|   |      \\    /    \n" +
                "  /         |          |   |   |     _ `--'      \n" +
                "  [   ,--.  |          |,--|   |]   (_) \n" +
                "  |__/    \\_|__________/    \\__|= o \n" +
                "     \\    /            \\    /\n" +
                "bmw   `--'              `--'");
        System.exit(0);
    }private static void victoryDialog() {
        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.println("\nВам говорит Волтер: -Отлично сработано! Мы справились с бунтом как настоящие *кхм*, ладно. Что ж, может, завтра поворотим зелья у меня дома?))) А сейчас продолжим работу.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void printSkull() {
        System.out.println("        uuuuuuuuuuuuuuuuuuuuu.\n" +
                "                   .u$$$$$$$$$$$$$$$$$$$$$$$$$$W.\n" +
                "                 u$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Wu.\n" +
                "               $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$i\n" +
                "              $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                "         `    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                "           .i$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$i\n" +
                "           $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$W\n" +
                "          .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$W\n" +
                "         .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$i\n" +
                "         #$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.\n" +
                "         W$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                "$u       #$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$~\n" +
                "$#      `\"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                "$i        $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                "$$        #$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                "$$         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                "#$.        $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#\n" +
                " $$      $iW$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$!\n" +
                " $$i      $$$$$$$#\"\" `\"\"\"#$$$$$$$$$$$$$$$$$#\"\"\"\"\"\"#$$$$$$$$$$$$$$$W\n" +
                " #$$W    `$$$#\"            \"       !$$$$$`           `\"#$$$$$$$$$$#\n" +
                "  $$$     ``                 ! !iuW$$$$$                 #$$$$$$$#\n" +
                "  #$$    $u                  $   $$$$$$$                  $$$$$$$~\n" +
                "   \"#    #$$i.               #   $$$$$$$.                 `$$$$$$\n" +
                "          $$$$$i.                \"\"\"#$$$$i.               .$$$$#\n" +
                "          $$$$$$$$!         .   `    $$$$$$$$$i           $$$$$\n" +
                "          `$$$$$  $iWW   .uW`        #$$$$$$$$$W.       .$$$$$$#\n" +
                "            \"#$$$$$$$$$$$$#`          $$$$$$$$$$$iWiuuuW$$$$$$$$W\n" +
                "               !#\"\"    \"\"             `$$$$$$$##$$$$$$$$$$$$$$$$\n" +
                "          i$$$$    .                   !$$$$$$ .$$$$$$$$$$$$$$$#\n" +
                "         $$$$$$$$$$`                    $$$$$$$$$Wi$$$$$$#\"#$$`\n" +
                "         #$$$$$$$$$W.                   $$$$$$$$$$$#   ``\n" +
                "          `$$$$##$$$$!       i$u.  $. .i$$$$$$$$$#\"\"\n" +
                "             \"     `#W       $$$$$$$$$$$$$$$$$$$`      u$#\n" +
                "                            W$$$$$$$$$$$$$$$$$$      $$$$W\n" +
                "                            $$`!$$$##$$$$``$$$$      $$$$!\n" +
                "                           i$\" $$$$  $$#\"`  \"\"\"     W$$$$\n" +
                "                                                   W$$$$!\n" +
                "                      uW$$  uu  uu.  $$$  $$$Wu#   $$$$$$\n" +
                "                     ~$$$$iu$$iu$$$uW$$! $$$$$$i .W$$$$$$\n" +
                "             ..  !   \"#$$$$$$$$$$##$$$$$$$$$$$$$$$$$$$$#\"\n" +
                "             $$W  $     \"#$$$$$$$iW$$$$$$$$$$$$$$$$$$$$$W\n" +
                "             $#`   `       \"\"#$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                "                              !$$$$$$$$$$$$$$$$$$$$$#`\n" +
                "                              $$$$$$$$$$$$$$$$$$$$$$!\n" +
                "                            $$$$$$$$$$$$$$$$$$$$$$$`\n" +
                "                             $$$$$$$$$$$$$$$$$$$$\"\n");
    }

    private static String generateRandomName() {
        String[] names = {"Иван", "Петр", "Михаил", "Александр", "Сергей"};
        return names[random.nextInt(names.length)];
    }

    private static int generateRandomAge() {
        return 18 + random.nextInt(60);
    }

    private static String generateRandomCrime() {
        String[] crimes = {"Кража", "Мошенничество", "Нарушение общественного порядка", "Нападение"};
        return crimes[random.nextInt(crimes.length)];
    }
}