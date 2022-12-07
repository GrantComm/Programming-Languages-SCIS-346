;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname list) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
; Grant Commodore

; This scheme program does a mini-version of the list programs.

; Compute the sum of the list.
(define (mySum lst)
  (if (null? lst)
      0
  (+  (car lst) (mySum (cdr lst)))))

; Reverse the list.
(define (reversed lst)
  (if (null? lst)
      lst
      (append (reversed (cdr lst)) (list (car lst)))))

; Compute the minimum of the list.
(define (mini a)
 (if (null? (cdr a)) (car a) 
  (min (car a) (mini(cdr a))) 
 )
)

; Compute the maximum of the list.
(define (maxi a)
 (if (null? (cdr a)) (car a) 
  (max (car a) (maxi(cdr a))) 
 )
)

; Create a list of 32 numbers.
(define mylist '(32 31 30 29 28 27 26 27 25 24 23 22 21 20 10 11 12 13 14 15 16 17 18 19 9 8 7 6 5 4 3 2 1))

; Print the list.
(print mylist)
(newline)

; Sum the list.
(print "The sum of the list is: ")
(print (mySum mylist))
(newline)

; Reverse the list.
(print "The reversed list: ")
(print (reversed mylist))
(newline)

; Sort the list.
(print "The sorted list: ")
(print (sort mylist <))
(newline)

; Get the minimum of the list.
(print "The minimum of the list: ")
(print (mini mylist))
(newline)

; Get the maximum of the list.
(print "The maximum of the list: ")
(print (maxi mylist))
(newline)
