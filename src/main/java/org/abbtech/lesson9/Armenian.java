package org.abbtech.lesson9;

interface Armenian {
    void attack(Azərbaycan azərbaycanlı);
}
class MəğlubErmənistan implements Armenian {
    public void attack(Azərbaycan azərbaycanlı) {
        System.out.println("Ermənistan " + azərbaycanlı.getClass().getSimpleName() + "a hücum edir");
    }
}

