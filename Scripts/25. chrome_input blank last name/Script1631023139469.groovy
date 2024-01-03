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

WebUI.click(findTestObject('menu login/a_Log in'))

WebUI.setText(findTestObject('screen login/input_Email_Email'), 'dwikartikoangger@gmail.com')

WebUI.setEncryptedText(findTestObject('screen login/input_Password_Password'), '/yHfb0TSrvKR9w8CFojpPFXIYOKg+Fwy')

WebUI.click(findTestObject('screen login/button_Log in'))

WebUI.click(findTestObject('menu login/validasi account'))

WebUI.click(findTestObject('my account/address'))

WebUI.click(findTestObject('my account/add new'))

WebUI.setText(findTestObject('my account/input first name'), 'angger')

WebUI.setText(findTestObject('my account/input last name'), '')

WebUI.setText(findTestObject('my account/input email'), 'dwikartikoangger@gmail.com')

WebUI.setText(findTestObject('my account/input company'), 'enabrl')

WebUI.selectOptionByValue(findTestObject('my account/select contry'), '134', false)

WebUI.click(findTestObject('my account/select state'))

WebUI.setText(findTestObject('my account/input city'), 'tangerang')

WebUI.setText(findTestObject('my account/input address'), 'pondok aren')

WebUI.setText(findTestObject('my account/input zip'), '150053')

WebUI.setText(findTestObject('my account/input phone number'), '087844233767')

WebUI.click(findTestObject('my account/button save'))

WebUI.verifyTextPresent('Last name is required.', false)

