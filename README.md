# Student Grades Book - Carnet de note pentru facultate
O aplicatie Java ce simuleaza un carnet de note pentru facultate, folosind principiile de baza ale POO si tool-uri specifice Java, precum Maven si Lombok.

## Modele

### Clase Abstracte
1. Abstract Entity - pentru o implementare mai usoara a id-ului
2. Persoana

### Clase
1. Student (singleton)
2. Semestru
3. Materie
4. Profesor
5. NotaCompusa - simuleaza o structura arborescenta, bazata pe ponderi
6. NotaSimpla - nota de baza (valoarea) - mosteneste NotaCompusa

### Enum-uri
1. TipCurs (Curs, Seminar, Laborator)
2. GradDidactic - gradele didactice universitare

## Interfate Servicii + Clase Implementari
1. SemestruService + SemestruServiceImpl
2. MaterieService + MaterieServiceImpl
3. NotaService + NotaServiceImpl
4. ProfesorService + ProfesorServiceImpl

## Aplicatie - Meniu
1. Adaugare semestru
2. Adaugare materie
3. Adaugare profesor
4. Adaugare nota
5. Calculare nota
6. Afisare profesori
7. Cautare profesori dupa grad didactic
8. Afisare materii
9. Stergere semestru
10. Afisare materii intr-un semestru
11. Stergere materii
12. Afisare semestre
