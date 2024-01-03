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

WebUI.click(findTestObject('checkout/pick category'))

WebUI.click(findTestObject('checkout/pick sub product'))

WebUI.click(findTestObject('checkout/pick product'))

WebUI.setText(findTestObject('checkout/qty'), '1')

WebUI.click(findTestObject('checkout/button add to card'))

WebUI.click(findTestObject('checkout/close notif'))

WebUI.click(findTestObject('checkout/button shopping card'))

WebUI.click(findTestObject('checkout/gift warapping'))

WebUI.click(findTestObject('checkout/Page_nopCommerce demo store. Shopping Cart/check box valid'))

WebUI.click(findTestObject('checkout/button checkout'))

WebUI.setText(findTestObject('screen login/input_Email_Email'), 'dwikartikoangger@gmail.com')

WebUI.setEncryptedText(findTestObject('screen login/input_Password_Password'), '/yHfb0TSrvKR9w8CFojpPFXIYOKg+Fwy')

WebUI.click(findTestObject('failed/Page_nopCommerce demo store. Login/button_Log in'))

WebUI.verifyElementClickable(findTestObject('menu login/validasi account'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('checkout/gift warapping'))

WebUI.click(findTestObject('checkout/Page_nopCommerce demo store. Shopping Cart/check box valid'))

WebUI.click(findTestObject('checkout/button checkout'))

WebUI.selectOptionByValue(findTestObject('checkout/select country'), '134', false)

WebUI.selectOptionByValue(findTestObject('checkout/select state'), '2', false)

WebUI.setText(findTestObject('checkout/fill city'), 'tangerang')

WebUI.setText(findTestObject('checkout/field address 1'), 'pondok aren')

WebUI.setText(findTestObject('checkout/field zip postal code'), '12121')

WebUI.setText(findTestObject('checkout/field phone number'), '087844233767')

WebUI.click(findTestObject('checkout/button continue billing address'))

WebUI.click(findTestObject('checkout/pick shipping methode'))

WebUI.click(findTestObject('checkout/button continue shipping methode'))

WebUI.click(findTestObject('checkout/pick payment methode'))

WebUI.click(findTestObject('checkout/button continue payment methode'))

WebUI.click(findTestObject('checkout/button continue payment information'))

WebUI.click(findTestObject('checkout/button confirm buy'))

