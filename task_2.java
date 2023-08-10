@Test
public void checkIsAdultWhenAgeIsLessThan18False() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(17);
    assertEquals("Должно вернуться false, т.к. пользователь не совершеннолетний", false, isAdult);
}
