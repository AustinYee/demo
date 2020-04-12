#!/usr/local/bin/lua 

print(type("Hello world"))      --> string
print(type(10.4 * 3))             --> number
print(type(print))              --> function
print(type(type))               --> function
print(type(true))               --> boolean
print(type(nil))                --> nil
print(type(type(X)))            --> string

a = 5
local b = 6
function wow()
    c = 8
    local d = 7
end
wow()
print(a, b, c, d)

while (a < 10)
do
    print(a)
    a = a + 1
    print(a)
end

print("for   exps")
for i = 1, 3 do
    print(i)
end

print('\n')
for i = 5, 1, -1 do
    print(i)
end

print("*******for ipairs*********")
a = { "one", "two", "three" }
for i, v in ipairs(a) do
    print(i, v)
end

if (0)
then
    print("0 = true")
else
    print("0 = false")
end