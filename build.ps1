$cwd = Get-Location

Set-Location $PSScriptRoot/00-parent

& mvn clean install

Set-Location $cwd