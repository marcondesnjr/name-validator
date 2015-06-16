/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.marcondesnjr.namevalidator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author José Marcondes do Nascimento Junior
 */
public class NameValidatorTest {
    
    public NameValidatorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testIsValidUmNome() {
        assertFalse(NameValidator.isValid("José"));
        assertFalse(NameValidator.isValid("1Jose"));
        assertFalse(NameValidator.isValid("José1"));
        assertFalse(NameValidator.isValid("Jo1sé"));  
    }
    
    @Test
    public void testIsValidUmNomeComNumero() {
        assertFalse(NameValidator.isValid("1José"));
        assertFalse(NameValidator.isValid("José1"));
        assertFalse(NameValidator.isValid("Jo1sé"));
    }
    
    @Test
    public void testIsValidUmNomeComSimbulo() {
        assertFalse(NameValidator.isValid("@José"));
        assertFalse(NameValidator.isValid("Jo@sé"));
        assertFalse(NameValidator.isValid("José@"));
    }
    @Test
    public void testIsValidDoisNomes() {
        assertTrue(NameValidator.isValid("José Marcondes"));
        assertTrue(NameValidator.isValid("José Marcôndes"));
    }
    @Test
    public void testIsValidDoisNomesInvalidos(){
        assertFalse(NameValidator.isValid("@José Marcondes"));
        assertFalse(NameValidator.isValid("José @Marcondes"));
        assertFalse(NameValidator.isValid("@José @Marcondes"));
        assertFalse(NameValidator.isValid("1José 1Marcondes"));
    }
    @Test
    public void testIsValidVariosNomes(){
        assertTrue(NameValidator.isValid("José Marcondes Nascimento"));
        assertTrue(NameValidator.isValid("José Marcondes do Nascimento"));
        assertTrue(NameValidator.isValid("José Marcondes do Nascimento Junior"));
    }
}
