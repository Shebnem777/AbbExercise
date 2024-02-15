package org.abbtech.Lesson6;
    class PersonManager<T extends Person> {
        private T[] items;
        private int size;

        public PersonManager(int capacity) {
            this.items = (T[]) new Person[capacity];
            this.size = 0;
        }


        public void addItem(T item) {
            if (size < items.length) {
                items[size++] = item;
            } else {
                System.out.println("Sistem doludur. Yeni element əlavə edilə bilməz.");
            }
        }
        public void removeItem(int id) {
            for (int i = 0; i < size; i++) {
                if (items[i].getId() == id) {
                    System.arraycopy(items, i + 1, items, i, size - i - 1);
                    items[--size] = null; // Son elementi null etmək (duplicatation)
                    return;
                }
            }
            System.out.println("Belə bir ID tapılmadı.");
        }

        // ID-yə görə elementi axtarmaq üçün
        public T searchItem(int id) {
            for (int i = 0; i < size; i++) {
                if (items[i].getId() == id) {
                    return items[i];
                }
            }
            return null;
        }

        // Bütün elementləri göstərmək üçün metod
        public void displayAllItems() {
            for (int i = 0; i < size; i++) {
                System.out.println(items[i]);
            }
        }

        // Elementlərin sayını qaytaran metod
        public int countItems() {
            return size;
        }

        // Unikal id-lərin yoxlanılması üçün metod
        public boolean isUnique(int id) {
            for (int i = 0; i < size; i++) {
                if (items[i].getId() == id) {
                    return false;
                }
            }
            return true;
        }
    }

