import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.nopcommerce.com/')

WebUI.click(findTestObject('register/Page_nopCommerce demo store/a_Register'))

WebUI.click(findTestObject('register/input_Gender_Gender'))

WebUI.setText(findTestObject('register/input_First name_FirstName'), 'angger')

WebUI.setText(findTestObject('register/input_Last name_LastName'), 'dwi kartiko')

WebUI.selectOptionByValue(findTestObject('register/select_Day123456789101112131415161718192021_40ab5b'), '27', true)

WebUI.selectOptionByValue(findTestObject('register/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), '1', true)

WebUI.selectOptionByValue(findTestObject('register/select_Year19111912191319141915191619171918_3665e7'), '1997', true)

WebUI.setText(findTestObject('register/input_Email_Email'), 'dwikartikoangger@gmail.com')

WebUI.setText(findTestObject('register/input_Company name_Company'), 'enablr')

WebUI.setEncryptedText(findTestObject('register/input_Password_Password'), '/yHfb0TSrvKR9w8CFojpPFXIYOKg+Fwy')

WebUI.setEncryptedText(findTestObject('register/input_Confirm password_ConfirmPassword'), '/yHfb0TSrvKR9w8CFojpPFXIYOKg+Fwy')

WebUI.click(findTestObject('register/button_Register'))

WebUI.verifyTextPresent('The specified email already exists', true)

