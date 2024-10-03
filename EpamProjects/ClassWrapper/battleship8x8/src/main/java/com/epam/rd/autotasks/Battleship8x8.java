package com.epam.rd.autotasks;

public class Battleship8x8 {
    private final long ships; // Поле для хранения положения кораблей
    private long shots = 0L;  // Поле для хранения выстрелов

    // Конструктор, инициализирующий положение кораблей
    public Battleship8x8(final long ships) {
        this.ships = ships;
    }

    // Метод для регистрации выстрела
    public boolean shoot(String shot) {
        int index = getIndex(shot);  // Получаем индекс ячейки на основе строки "A1"
        long mask = 1L << index;  // Создаем маску для битовой операции
        shots |= mask;            // Обновляем выстрелы с помощью OR-операции
        return (ships & mask) != 0;  // Возвращаем true, если выстрел попал в корабль
    }

    // Метод для получения текущего состояния поля
    public String state() {
        StringBuilder sb = new StringBuilder(64);
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                int index = row * 8 + col;  // Индекс по строкам и столбцам
                long mask = 1L << index;  // Создаем маску для проверки бита

                if ((ships & mask) != 0) {  // Если в ячейке находится корабль
                    if ((shots & mask) != 0) {
                        sb.append('☒');  // Корабль, по которому стреляли
                    } else {
                        sb.append('☐');  // Корабль, по которому не стреляли
                    }
                } else {  // Если в ячейке нет корабля
                    if ((shots & mask) != 0) {
                        sb.append('×');  // Пустая ячейка, по которой стреляли
                    } else {
                        sb.append('.');  // Пустая ячейка, по которой не стреляли
                    }
                }
            }
            sb.append('\n');  // Добавляем новую строку после каждого ряда
        }
        return sb.toString();
    }

    // Метод для преобразования координат выстрела (например, "A1") в индекс в битовом представлении
    private int getIndex(String shot) {
        char column = shot.charAt(0);  // Извлекаем символ столбца (буква)
        int row = Character.getNumericValue(shot.charAt(1));  // Извлекаем номер строки
        int colIndex = column ;  // Преобразуем букву в индекс от 0 до 7
        int rowIndex = row;       // Преобразуем строку в индекс от 0 до 7
        return rowIndex * 8 + colIndex;  // Возвращаем итоговый индекс
    }
    public static void main(String[] args) {
        long map = 0b11110000_00000111_00000000_00110000_00000010_01000000_00000000_00000000L;
        Battleship8x8 battle = new Battleship8x8(map);
        battle.shoot("A1");
        battle.shoot("B2");
        battle.shoot("C3");
        battle.shoot("D4");
        System.out.println(battle.state());
    }

}
