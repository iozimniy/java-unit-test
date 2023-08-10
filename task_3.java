@Test
public void checkIsAdultWhenAgeIs18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(18);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
}
