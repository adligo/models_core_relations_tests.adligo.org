package org.adligo.models.core_relations_tests.shared.assertions;

import java.util.HashSet;
import java.util.Set;

import org.adligo.models.core.shared.EMailAddress;
import org.adligo.models.core.shared.I_StorageIdentifier;
import org.adligo.models.core.shared.InvalidParameterException;
import org.adligo.models.core.shared.ModelsCoreEnglishConstants;
import org.adligo.models.core_relations.shared.EMail;
import org.adligo.models.core_relations.shared.EMailMutant;
import org.adligo.models.core_relations.shared.ids.StringIdentifierMutant;
import org.adligo.models.core_tests.shared.assertions.IPEExceptionAsserter;
import org.adligo.tests.shared.I_Test;

public class EMailAssertions {

	public static void assertConstructorInvalidParameterExceptions(String pre, I_Test test) throws Exception {
		EMailMutant mutant = new EMailMutant();
		
		InvalidParameterException x = null;
		
		try {
			new EMail(mutant);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.E_MAIL, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_REQUIRES_A_FROM_ADDRESS, x.getMessage());
		
		mutant.setFrom(new EMailAddress("support@adligo.com"));
		
		x = null;
		try {
			new EMail(mutant);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.E_MAIL, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_REQUIRES_A_DESTINATION_ADDRESS, x.getMessage());
		
	}
	
	public static void assertSetterInvalidParameterExceptions(String pre, I_Test test) throws Exception {
		EMailMutant mutant = new EMailMutant();
		
		InvalidParameterException x = null;
		
		try {
			mutant.setFrom(null);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.SET_FROM, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_REQUIRES_A_FROM_ADDRESS, x.getMessage());
		
		x = null;
		try {
			mutant.setFrom(new EMailAddress());
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.SET_FROM, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_REQUIRES_A_VALID_FROM_ADDRESS, x.getMessage());
		
		x = null;
		try {
			mutant.addAttachment(null);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_ATTACHMENT, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ATTACHEMNT_MAY_NOT_BE_NULL, x.getMessage());
		
		x = null;
		try {
			mutant.addAttachment(new StringIdentifierMutant());
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_ATTACHMENT, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ATTACHMENT_MAY_NOT_BE_EMPTY, x.getMessage());
		
		Set<I_StorageIdentifier> set = new HashSet<I_StorageIdentifier>();
		set.add(null);
		
		try {
			mutant.setAttachments(set);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_ATTACHMENT, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ATTACHEMNT_MAY_NOT_BE_NULL, x.getMessage());
		
		set.clear();
		set.add(new StringIdentifierMutant());
		
		try {
			mutant.setAttachments(set);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_ATTACHMENT, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ATTACHMENT_MAY_NOT_BE_EMPTY, x.getMessage());
		
		
		x = null;
		try {
			mutant.addTo(null);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_TO, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ADDRESS_IS_NOT_VALID, x.getMessage());
		
		x = null;
		try {
			mutant.addTo(new EMailAddress());
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_TO, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ADDRESS_IS_NOT_VALID, x.getMessage());
		
		Set<EMailAddress> emailSet = new HashSet<EMailAddress>();
		emailSet.add(null);
		x = null;
		try {
			mutant.setToAddresses(emailSet);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_TO, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ADDRESS_IS_NOT_VALID, x.getMessage());
		
		emailSet.clear();
		emailSet.add(new EMailAddress());
		x = null;
		try {
			mutant.setToAddresses(emailSet);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_TO, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ADDRESS_IS_NOT_VALID, x.getMessage());
		
		//CC
		x = null;
		try {
			mutant.setCcAddresses(null);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_CC, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ADDRESS_IS_NOT_VALID, x.getMessage());
		
		x = null;
		try {
			mutant.addCcAddresses(new EMailAddress());
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_CC, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ADDRESS_IS_NOT_VALID, x.getMessage());
		
		emailSet.clear();
		emailSet.add(null);
		x = null;
		try {
			mutant.setCcAddresses(emailSet);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_CC, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ADDRESS_IS_NOT_VALID, x.getMessage());
		
		emailSet.clear();
		emailSet.add(new EMailAddress());
		x = null;
		try {
			mutant.setCcAddresses(emailSet);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_CC, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ADDRESS_IS_NOT_VALID, x.getMessage());
		
		//BCC
		x = null;
		try {
			mutant.addBcc(null);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_BCC, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ADDRESS_IS_NOT_VALID, x.getMessage());
		
		x = null;
		try {
			mutant.addBcc(new EMailAddress());
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_BCC, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ADDRESS_IS_NOT_VALID, x.getMessage());
		
		emailSet.clear();
		emailSet.add(null);
		x = null;
		try {
			mutant.setBccAddresses(emailSet);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_BCC, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ADDRESS_IS_NOT_VALID, x.getMessage());
		
		emailSet.clear();
		emailSet.add(new EMailAddress());
		x = null;
		try {
			mutant.setBccAddresses(emailSet);
		} catch (Exception g) {
			x = IPEExceptionAsserter.isIPE(g, test);
		}
		test.assertIsNotNull(x);
		test.assertIsEquals(EMailMutant.ADD_BCC, x.getMethodName());
		test.assertIsEquals(pre + ModelsCoreEnglishConstants.EMAIL_ADDRESS_IS_NOT_VALID, x.getMessage());
	}
	
	public static void assertMutators(I_Test test) throws Exception {
		EMailMutant mutant = new EMailMutant();
		
		mutant.setFrom(new EMailAddress("support@adligo.com"));
		test.assertIsEquals(new EMailAddress("support@adligo.com"), mutant.getFrom());
		
		mutant.setSubject("subject");
		test.assertIsEquals("subject", mutant.getSubject());
		
		mutant.setBody("body");
		test.assertIsEquals("body", mutant.getBody());
		
		//tos
		test.assertIsTrue(mutant.addTo(new EMailAddress("to@adligo.com")));
		Set<EMailAddress> tos = mutant.getToAddresses();
		test.assertIsEquals(1, tos.size());
		test.assertIsTrue(tos.contains(new EMailAddress("to@adligo.com")));
		test.assertIsTrue(mutant.removeTo(new EMailAddress("to@adligo.com")));
		tos = mutant.getToAddresses();
		test.assertIsEquals(0, tos.size());
		
		Set<EMailAddress> newTos = new HashSet<EMailAddress>();
		test.assertIsTrue(newTos.add(new EMailAddress("to1@adligo.com")));
		test.assertIsTrue(newTos.add(new EMailAddress("to2@adligo.com")));
		test.assertIsTrue(mutant.setToAddresses(newTos));
		tos = mutant.getToAddresses();
		test.assertIsEquals(2, tos.size());
		test.assertIsTrue(tos.contains(new EMailAddress("to1@adligo.com")));
		test.assertIsTrue(tos.contains(new EMailAddress("to2@adligo.com")));
		test.assertIsTrue(mutant.removeAllTo(newTos));
		tos = mutant.getToAddresses();
		test.assertIsEquals(0, tos.size());
		
		//ccs
		test.assertIsTrue(mutant.addCcAddresses(new EMailAddress("cc@adligo.com")));
		Set<EMailAddress> ccs = mutant.getCcAddresses();
		test.assertIsEquals(1, ccs.size());
		test.assertIsTrue(ccs.contains(new EMailAddress("cc@adligo.com")));
		test.assertIsTrue(mutant.removeCc(new EMailAddress("cc@adligo.com")));
		ccs = mutant.getCcAddresses();
		test.assertIsEquals(0, ccs.size());
		
		Set<EMailAddress> newCcs = new HashSet<EMailAddress>();
		test.assertIsTrue(newCcs.add(new EMailAddress("cc1@adligo.com")));
		test.assertIsTrue(newCcs.add(new EMailAddress("cc2@adligo.com")));
		test.assertIsTrue(mutant.setCcAddresses(newCcs));
		ccs = mutant.getCcAddresses();
		test.assertIsEquals(2, ccs.size());
		test.assertIsTrue(ccs.contains(new EMailAddress("cc1@adligo.com")));
		test.assertIsTrue(ccs.contains(new EMailAddress("cc2@adligo.com")));
		test.assertIsTrue(mutant.removeAllCc(newCcs));
		ccs = mutant.getCcAddresses();
		test.assertIsEquals(0, ccs.size());
		
		//bccs
		test.assertIsTrue(mutant.addBcc(new EMailAddress("bcc@adligo.com")));
		Set<EMailAddress> bccs = mutant.getBccAddresses();
		test.assertIsEquals(1, bccs.size());
		test.assertIsTrue(bccs.contains(new EMailAddress("bcc@adligo.com")));
		test.assertIsTrue(mutant.removeBcc(new EMailAddress("bcc@adligo.com")));
		bccs = mutant.getBccAddresses();
		test.assertIsEquals(0, bccs.size());
		
		Set<EMailAddress> newBccs = new HashSet<EMailAddress>();
		test.assertIsTrue(newBccs.add(new EMailAddress("bcc1@adligo.com")));
		test.assertIsTrue(newBccs.add(new EMailAddress("bcc2@adligo.com")));
		test.assertIsTrue(mutant.setBccAddresses(newBccs));
		bccs = mutant.getBccAddresses();
		test.assertIsEquals(2, bccs.size());
		test.assertIsTrue(bccs.contains(new EMailAddress("bcc1@adligo.com")));
		test.assertIsTrue(bccs.contains(new EMailAddress("bcc2@adligo.com")));
		test.assertIsTrue(mutant.removeAllBcc(newBccs));
		bccs = mutant.getBccAddresses();
		test.assertIsEquals(0, bccs.size());
		
		//attachments
		test.assertIsTrue(mutant.addAttachment(new StringIdentifierMutant("some_file")));
		Set<I_StorageIdentifier> attachments = mutant.getAttachments();
		test.assertIsEquals(1, attachments.size());
		test.assertIsTrue(attachments.contains(new StringIdentifierMutant("some_file")));
		test.assertIsTrue(mutant.removeAttachment(new StringIdentifierMutant("some_file")));
		attachments = mutant.getAttachments();
		test.assertIsEquals(0, attachments.size());
		
		Set<I_StorageIdentifier> newAttachemnts = new HashSet<I_StorageIdentifier>();
		test.assertIsTrue(newAttachemnts.add(new StringIdentifierMutant("file1")));
		test.assertIsTrue(newAttachemnts.add(new StringIdentifierMutant("file2")));
		test.assertIsTrue(mutant.setAttachments(newAttachemnts));
		attachments = mutant.getAttachments();
		test.assertIsEquals(2, attachments.size());
		test.assertIsTrue(attachments.contains(new StringIdentifierMutant("file1")));
		test.assertIsTrue(attachments.contains(new StringIdentifierMutant("file2")));
		test.assertIsTrue(mutant.removeAllAttachments(newAttachemnts));
		attachments = mutant.getAttachments();
		test.assertIsEquals(0, attachments.size());
	}
	
	public static void assertCopy(I_Test test) throws Exception {
		EMailMutant mutant = new EMailMutant();
		
		mutant.setFrom(new EMailAddress("support@adligo.com"));
		mutant.setSubject("subject");
		mutant.setBody("body");
		test.assertIsTrue(mutant.addTo(new EMailAddress("to@adligo.com")));
		test.assertIsTrue(mutant.addCcAddresses(new EMailAddress("cc@adligo.com")));
		test.assertIsTrue(mutant.addBcc(new EMailAddress("bcc@adligo.com")));
		test.assertIsTrue(mutant.addAttachment(new StringIdentifierMutant("some_file")));
		
		EMail email = new EMail(mutant);
		test.assertIsEquals(new EMailAddress("support@adligo.com"), email.getFrom());
		test.assertIsEquals("subject", email.getSubject());
		test.assertIsEquals("body", email.getBody());
		
		Set<EMailAddress> tos = mutant.getToAddresses();
		test.assertIsEquals(1, tos.size());
		test.assertIsTrue(tos.contains(new EMailAddress("to@adligo.com")));
		
		Set<EMailAddress> ccs = mutant.getCcAddresses();
		test.assertIsEquals(1, ccs.size());
		test.assertIsTrue(ccs.contains(new EMailAddress("cc@adligo.com")));
		
		Set<EMailAddress> bccs = mutant.getBccAddresses();
		test.assertIsEquals(1, bccs.size());
		test.assertIsTrue(bccs.contains(new EMailAddress("bcc@adligo.com")));
		
		Set<I_StorageIdentifier> attachments = mutant.getAttachments();
		test.assertIsEquals(1, attachments.size());
		test.assertIsTrue(attachments.contains(new StringIdentifierMutant("some_file")));
	}
}
