public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon("Fiery Sword", 100);
        Boss boss = new Boss("Огненный Дракон", 1000, 50, bossWeapon);


        boss.setName("Огненный Дракон");
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setWeapon(bossWeapon);


        System.out.println("Имя босса: " + boss.getName());
        System.out.println("Здоровье босса: " + boss.getHealth());
        System.out.println("Урон босса: " + boss.getDamage());
        System.out.println("Оружие босса: " + boss.getWeapon().getWeaponName() + ", Урон: " + boss.getWeapon().getWeaponType());
    }
}